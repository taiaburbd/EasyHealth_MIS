package it.unicas.app.dao;

import it.unicas.app.pojo.App;
import it.unicas.image.pojo.MedicalImaging;
import it.unicas.products.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AppManagementDAO {


	public static App getTotalpatients() {
		App total_patients=null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT COUNT(patient_id) AS total_patients FROM patient_list ");
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				total_patients = new App(
						rs.getString("total_patients")
					);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return total_patients;
	}
}
