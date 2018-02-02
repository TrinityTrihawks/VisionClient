import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class NTInteraction {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NetworkTableInstance inst = NetworkTableInstance.getDefault();
		NetworkTable table = inst.getTable("datatable");
		NetworkTableEntry entry  = table.getEntry("X");
		entry.setDouble(47);
		
	}

}
