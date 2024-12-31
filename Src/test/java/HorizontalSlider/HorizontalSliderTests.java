package HorizontalSlider;

import Base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends baseTests {



    @Test
    public void testSlidertoNumber(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");


    }
}
