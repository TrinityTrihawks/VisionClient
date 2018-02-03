import edu.wpi.cscore.AxisCamera;
import edu.wpi.first.wpilibj.CameraServer;

public class CameraData {
	
	private static final int IMG_WIDTH = 320;
	private static final int IMG_HEIGHT = 240;
	// Sets Camera Image Resolution

	AxisCamera camera;

	public CameraData() {
		CameraServer server = CameraServer.getInstance();
		camera = server.addAxisCamera("10.42.15.37");
	    camera.setResolution(IMG_WIDTH, IMG_HEIGHT);
	    server.startAutomaticCapture();	//Begins getting video from the camera

	}
}
