public class Robot {

    private String name;
    private String robotype = "a Star Wars robot";

    public Robot(String name) {
        this.name = name;
    }

    /**
     * The robot executes the given order
     * @param roi
     */
    public void executeOrder(RobotOrderInterface roi)
    {
        roi.instructions(this.name);

    }
}
