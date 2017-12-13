package by.htp.rent.runner;

import by.htp.rent.dao.CatalogData;
import by.htp.rent.dao.db.CatalogDataMySqlImpl;
import by.htp.rent.domain.Catalog;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CatalogData dao = new CatalogDataMySqlImpl();
		Catalog catalog = dao.readCatalog();

		System.out.println(catalog);

	}

}
