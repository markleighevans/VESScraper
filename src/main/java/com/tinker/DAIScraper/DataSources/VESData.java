package com.tinker.DAIScraper.DataSources;

import java.io.IOException;
import com.tinker.DAIScraper.Representations.Vehicle;
/**
 * Created by root on 06/12/15.
 */
public class VESData {
    public static Vehicle GetVehicleDetails(Vehicle Vehicle) throws IOException
    {
        Vehicle.SetMake("DUMMY");
        System.out.println("VRM:" + Vehicle.GetVRM() + "Make:" + Vehicle.GetMake());
        return Vehicle;
    }
}
