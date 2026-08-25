import java.util.ArrayList;
import java.util.List;

import bai1.Vehicle;
import bai3.VehicleService;


public class VehicleServiceImpl implements VehicleService{
    private ArrayList<Vehicle> vehicles;

    public VehicleServiceImpl(ArrayList<Vehicle> vehicles) {

        this.vehicles = new ArrayList<>();
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public boolean updateVehicle(String id, Vehicle newVehicle) {
        for(Vehicle vehicle : vehicles){
            if(vehicle.getId().equalsIgnoreCase(id)){
                vehicles.set(vehicle);
            }
        }
        return true;
    }

    @Override
    public boolean deleteVehicle(String id) {
        for(Vehicle vehicle : vehicles){
            if(vehicle.getId().equalsIgnoreCase(id)){
                vehicles.remove(vehicle);
            }
        }
        return true;
    }

    @Override
    public List<Vehicle> serchByName(String name) {
        List<Vehicle> copy = new ArrayList<>();
        for(Vehicle v : vehicles){
            if(v.getName().equalsIgnoreCase(name)){
                copy.add(v);
            }
        }
        return copy;
    }

    @Override
    public void sortByPrice(boolean ascending) {
        System.out.println("Tăng dần: ");

    }

    @Override
    public void displayAllVehicles() {
        System.out.println("Danh sách phương tiện: ");
        for(Vehicle v : vehicles){

        }
    }
}