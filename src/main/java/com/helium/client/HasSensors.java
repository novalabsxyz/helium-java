package com.helium.client;

import java.io.IOException;
import java.util.List;

public interface HasSensors {

    List<Sensor> sensors() throws IOException;
}
