public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int rows, int columns) {
        lights = new boolean[rows][columns];
    }

    public boolean[][] getLights() {
        return lights;
    }

    public boolean evaluateLight(int row, int column) {
        return lights[row][column];
    }

    public void setLights(boolean[][] lights) {
        this.lights=lights;


    }
}
