package nl.thielman.demo.demo.stores;

import nl.thielman.demo.stores.TicketStore;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TicketStoreTest {

    TicketStore store = new TicketStore();

    @Test
    public void testName(){
        store.setName("name");
        Assert.assertEquals("name",store.getName());
    }

    @Test
    public void testAmountSold(){

    }

}
