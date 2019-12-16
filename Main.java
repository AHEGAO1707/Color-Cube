import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.scale(250);
        cube.rotate(20, 20, 20);
        Viewer Kubik = new Viewer(250, 250, cube);
    }
}
