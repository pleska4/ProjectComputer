package computer.functionalInterfaces;

@FunctionalInterface
public interface ICalculateUsers {
    String calculateUsers();

    static String usersOfDevice(int users) {
        return "Users of Devices: "+ users;
    }

}
