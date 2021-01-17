package ch.visualboard.library.visualboard.utils;

import static ch.visualboard.library.visualboard.utils.ImageUtilsTestObjects.EXPECTED_CONVERT_IMAGE_TO_RGB_MATRIX_BYTES;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.ResourceUtils;

@ExtendWith(MockitoExtension.class)
class ImageUtilsTest
{
    private BufferedImage bufferedImage;

    @BeforeEach
    void setUp() throws IOException
    {
        bufferedImage = ImageIO.read(ResourceUtils.getFile("classpath:test-image.png"));
    }

    @Test
    void testIf_convertImageToRgbMatrixBytes_isSuccessful()
    {
        String result = Arrays.toString(ImageUtils.convertImageToRgbMatrixBytes(bufferedImage));

        Assertions.assertEquals(Arrays.toString(EXPECTED_CONVERT_IMAGE_TO_RGB_MATRIX_BYTES), result);
    }

}
