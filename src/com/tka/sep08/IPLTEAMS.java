package com.tka.sep08;

public class IPLTEAMS {
	
		
//		POJO Class/ Entity Class
		private String tname;
		private int jn;
		private String name;
		private int runs;
		private int Wikets;
		
		
		public IPLTEAMS() {
			super();
		}


		public IPLTEAMS(String tname, int jn, String name, int runs, int wikets) {
			super();
			this.tname = tname;
			this.jn = jn;
			this.name = name;
			this.runs = runs;
			Wikets = wikets;
		}


		public IPLTEAMS(int playerJN, String tName2, String pName, int runs2, int wik) {
			
		}


		public String getTname() {
			return tname;
		}


		public void setTname(String tname) {
			this.tname = tname;
		}


		public int getJn() {
			return jn;
		}


		public void setJn(int jn) {
			this.jn = jn;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getRuns() {
			return runs;
		}


		public void setRuns(int runs) {
			this.runs = runs;
		}


		public int getWikets() {
			return Wikets;
		}


		public void setWikets(int wikets) {
			Wikets = wikets;
		}


//		@Override
//		public String toString() {
//			return "IPL2025 -> [TName="  + tname + ", JN=" + jn + ", Name=" + name + ", Runs=" + runs + ", Wikets=" + Wikets
//					+ "]";
//		}


		public Object getTName() {
			
			return null;
		}
		
		

	}



