package week1.Mockito_ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Create Mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub Method
        when(mockApi.getData())
                .thenReturn("Mock Data");

        // Inject Mock
        MyService service =
                new MyService(mockApi);

        // Call Service Method
        String result =
                service.fetchData();

        // Verify Result
        assertEquals("Mock Data", result);
    }
    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}
