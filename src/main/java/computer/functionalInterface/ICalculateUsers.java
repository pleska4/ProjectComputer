package computer.functionalInterface;

@FunctionalInterface
public interface ICalculateUsers {
    int calculate(int users);

    static String usersOfDevice(int users) {
        return "Users of Devices: "+ users;
    }

}
