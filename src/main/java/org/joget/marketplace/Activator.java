package org.joget.marketplace;

import java.util.ArrayList;
import java.util.Collection;
import org.joget.apps.datalist.model.DataListTemplate;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

    protected Collection<ServiceRegistration<?>> registrationList;

    public void start(BundleContext context) {
        registrationList = new ArrayList<ServiceRegistration<?>>();

        // Register ProfileGridList datalist template
        registrationList.add(
            context.registerService(
                ProfileGridList.class.getName(),
                new ProfileGridList(),
                null
            )
        );
    }

    public void stop(BundleContext context) {
        for (ServiceRegistration<?> registration : registrationList) {
            registration.unregister();
        }
    }
}