package phaseshift.com.demophase;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

/**
 * Created by Rohan on 19-07-2017.
 */

public class SplashIntroActivity extends IntroActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setButtonBackVisible(true);
        setButtonBackFunction(BUTTON_BACK_FUNCTION_SKIP);
        //setButtonBackFunction(BUTTON_BACK_FUNCTION_BACK);
        setButtonNextVisible(true);
        //setButtonNextFunction(BUTTON_NEXT_FUNCTION_NEXT_FINISH);
        //setButtonNextFunction(BUTTON_NEXT_FUNCTION_NEXT);
        setButtonCtaVisible(false);
        //setButtonCtaTintMode(BUTTON_CTA_TINT_MODE_TEXT);

        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_material_metaphor)
                .description(R.string.description_material_metaphor)
                .image(R.mipmap.ic_launcher_round)
                .background(R.color.color_material_metaphor)
                .backgroundDark(R.color.color_dark_material_metaphor)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_material_bold)
                .description(R.string.description_material_bold)
                .image(R.mipmap.ic_launcher_round)
                .background(R.color.color_material_bold)
                .backgroundDark(R.color.color_dark_material_bold)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title(R.string.title_material_motion)
                .description(R.string.description_material_motion)
                .image(R.mipmap.ic_launcher_round)
                .background(R.color.color_material_motion)
                .backgroundDark(R.color.color_dark_material_motion)
                .build());
    }
}
