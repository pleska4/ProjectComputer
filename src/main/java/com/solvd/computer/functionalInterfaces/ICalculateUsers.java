package computer.functionalInterfaces;

@FunctionalInterface
public interface ICalculateUsers {
    int iCalculateUsers (int colNames);

    default String usersOfDevice(int users) {
        return "Users of Devices: "+users;
    }

}
