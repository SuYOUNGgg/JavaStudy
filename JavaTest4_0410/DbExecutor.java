
public class DbExecutor {
	static Database CreateDatabase(String dbname) {
		Database db = null;
		switch(dbname) {
			case "MySql":
				db = new MySql();
				break;
			case "Oracle":
				db = new Oracle();
				break;
				
		}
		return db;
		
	}
	public static void main(String[] args) {
		
			Database db = CreateDatabase("MySql");
			db.open();
			Database db2 = CreateDatabase("Oracle");
			db2.open();

		//Database db = CreateDatabase("MySql");    밑에 new를 써서 쓰기 귀찮으니까 이렇게 쓸 수 있음
		//db.open();
	
		//MySql s = new MySql();
		
		//Database db2 = CreateDateabase("Oracle");
		//db2.open();
	}

}
