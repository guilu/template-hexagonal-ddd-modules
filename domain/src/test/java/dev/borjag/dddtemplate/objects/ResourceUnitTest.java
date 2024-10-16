package dev.borjag.dddtemplate.objects;

import com.emobg.microservice.entity.Resource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ResourceUnitTest {

    @Test
    void create_correctly() {
        String id = "dummyId";
        String name = "dummyName";
        String date = "01/01/2020";

        Resource resource = new Resource(id, name, date);

        assertThat(resource.getId()).isEqualTo(id);
        assertThat(resource.getName()).isEqualTo(name);
        assertThat(resource.getDate()).isEqualTo(date);
    }

}
