package firstweek.exercise;

abstract class AbstractGameCar implements IMovementControllable, ISpecModifiable{
    int maxSpeed;
    int currentSpeed;
    String color;
    abstract int getMaxSpeed();
    abstract String getColor();
    abstract String getSignal(String inputSignal);
    abstract void interpresentSignal(String signal);
}
