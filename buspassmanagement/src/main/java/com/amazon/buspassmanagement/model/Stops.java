package com.amazon.buspassmanagement.model;

/*MSSQL:
create table Stops(
		stopID INT IDENTITY(1,1),
		address NVARCHAR(50) NOT NULL,
		sequenceOrder INT NOT NULL,
		routeID INT constraint stops_routeID_fk references Routes(routeID),
		adminID INT constraint stops_id_fk references Users(id),
		createdOn DATETIME DEFAULT CURRENT_TIMESTAMP,
		PRIMARY KEY(stopID));
*/

public class Stops {
	
	// Attributes
		public int stopID;
	    public String address;
	    public int sequenceOrder;
	    public int routeID;
	    public int adminID;
	    public String createdOn;
	    
	    
		public Stops() {
		}


		public Stops(int stopID, String address, int sequenceOrder, int routeID, int adminID, String createdOn) {
			this.stopID = stopID;
			this.address = address;
			this.sequenceOrder = sequenceOrder;
			this.routeID = routeID;
			this.adminID = adminID;
			this.createdOn = createdOn;
		}
		
		public void prettyPrintForAdmin(Stops stop) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("StopID:\t\t\t"+stop.stopID);
			System.out.println("Address:\t\t"+stop.address);
			System.out.println("Sequence Order:\t\t"+stop.sequenceOrder);
			System.out.println("RouteID:\t\t"+stop.routeID);
			System.out.println("AdminID:\t\t"+stop.adminID);
			System.out.println("CreatedOn:\t\t"+stop.createdOn);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		
		public void prettyPrintForUser(Stops stops) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Stop address:\t\t"+stops.address);
			System.out.println("Stop SequenceOrder:\t\t"+stops.sequenceOrder);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		}

		@Override
		public String toString() {
			return "Stops [stopsID=" + stopID + ", address=" + address + ", sequenceOrder=" + sequenceOrder
					+ ", routeID=" + routeID + ", adminID=" + adminID + ", createdOn=" + createdOn + "]";
		}
		
		
	    
	    

}
