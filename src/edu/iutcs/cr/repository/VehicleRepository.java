package edu.iutcs.cr.repository;

import edu.iutcs.cr.vehicles.Vehicle;

public interface VehicleRepository {
    Vehicle findByRegistrationNumber(String registrationNumber);
}
