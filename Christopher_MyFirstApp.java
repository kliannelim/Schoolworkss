import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView helloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloTextView = findViewById(R.id.helloTextView);

        // Animate the "Hello World" text with a fade-in animation
        animateHelloText();
    }

    private void animateHelloText() {
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        fadeIn.setDuration(2000); // You can adjust the duration as needed
        fadeIn.setFillAfter(true);

        helloTextView.startAnimation(fadeIn);
    }
}
