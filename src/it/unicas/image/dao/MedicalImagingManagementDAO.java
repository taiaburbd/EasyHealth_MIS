package it.unicas.image.dao;

import it.unicas.image.pojo.MedicalImaging;
import it.unicas.patients.pojo.Patients;
import it.unicas.products.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalImagingManagementDAO {
	public static List<MedicalImaging> getAlldata(String patientName, String investigationType, String createdDate) {
		List<MedicalImaging> dataList = new ArrayList<MedicalImaging>();
		String whereClause = "";
		if((patientName == null || patientName.equals("")) && (investigationType == null || investigationType.equals("")) && (createdDate == null || createdDate.equals(""))) {
			whereClause = "";
		}
		else {
			whereClause = " WHERE ";
		}
		int count = 0;
		if(patientName != null && !patientName.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "patient_list.patient_name = "+"'"+patientName+"'";
		}
		if(investigationType != null && !investigationType.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "investigation_type = "+"'"+investigationType+"'";
		}
		if(createdDate != null && !createdDate.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "created_date = "+"'"+createdDate+"'";
		}
		String joinStatement=" JOIN patient_list ON patient_list.patient_id=medical_imaging.patient_id";

		try
		{
			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			System.out.println("SELECT * FROM medical_imaging"+whereClause+joinStatement);

			ResultSet rs= st.executeQuery("SELECT * FROM medical_imaging"+whereClause+joinStatement);
			while(rs.next())
			{
				MedicalImaging image = new MedicalImaging(
						rs.getString("image_id"),
						rs.getString("pimage_id"),
						rs.getString("patient_id"),
						rs.getString("patient_name"),
						rs.getString("investigation_type"),
						rs.getString("image_path"),
						rs.getString("created_date")
				);
				dataList.add(image);
			}
			
			DBUtil.closeConnection(conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dataList;
	}
	public static List<MedicalImaging> getChilddata(String imageId) {
		List<MedicalImaging> dataList = new ArrayList<MedicalImaging>();
		String whereClause = " WHERE pimage_id="+imageId;

		String joinStatement=" JOIN patient_list ON patient_list.patient_id=medical_imaging.patient_id";

		try
		{
			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			System.out.println("SELECT * FROM medical_imaging "+joinStatement+whereClause);

			ResultSet rs= st.executeQuery("SELECT * FROM medical_imaging "+joinStatement+whereClause);
			while(rs.next())
			{
				MedicalImaging image = new MedicalImaging(
						rs.getString("image_id"),
						rs.getString("pimage_id"),
						rs.getString("investigation_type"),
						rs.getString("image_path"),
						rs.getString("created_date")
				);
				dataList.add(image);
			}

			DBUtil.closeConnection(conn);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dataList;
	}

	public static MedicalImaging getDataById(String imageId) {
		MedicalImaging image = null;
		String joinStatement=" JOIN patient_list ON patient_list.patient_id=medical_imaging.patient_id";

		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM medical_imaging " + joinStatement+" WHERE image_id = ?");
			ps.setString(1, imageId);
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				image = new MedicalImaging(
						rs.getString("image_id"),
						rs.getString("pimage_id"),
						rs.getString("patient_id"),
						rs.getString("patient_name"),
						rs.getString("investigation_type"),
						rs.getString("image_path"),
						rs.getString("created_date"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return image;
	}
	public static int addData(MedicalImaging imaging) {

		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO medical_imaging (patient_id,pimage_id,image_path,investigation_type) VALUES(?,?,?,?)");
			ps.setString(1, imaging.getPatientId());
			ps.setString(2, imaging.getImageIdParents());
			ps.setString(3, imaging.getImagePath());
			ps.setString(4, imaging.getInvestigationType());
			status = ps.executeUpdate();
			System.out.println(ps);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

}
