import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static jdk.internal.org.jline.utils.InfoCmp.Capability.byName;
import static sun.jvm.hotspot.runtime.BasicObjectLock.size;


public class GoogleTest {
    @Test
    public void search() {
        open("https://google.com");
        $(byName("q")).setValue("selenide").pressEnter();
        elements("#search.g").shouldHave(size(6));

        
        

    }
}
