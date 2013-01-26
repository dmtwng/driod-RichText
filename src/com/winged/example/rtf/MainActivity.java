package com.winged.example.rtf;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Class for main activity.
 * 
 * @author WingeD
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create spannable text and set style.
		Spannable text = new SpannableString("This is underline and bold text.");
		text.setSpan(new UnderlineSpan(), 8, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		text.setSpan(new StyleSpan(Typeface.BOLD), 22, 26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		
		// Set spannable text in TextView.
		TextView textView = (TextView) findViewById(R.id.text);
		textView.setText(text);
		
		
		// Create spannable text and set style.
		Spannable buttonText = new SpannableString("Italic text");
		buttonText.setSpan(new StyleSpan(Typeface.ITALIC), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		
		// Set spannable text in TextView.
		Button button = (Button) findViewById(R.id.button);
		button.setText(buttonText);
	}


	public void onButtonClick(View v) {
		Spannable text = new SpannableString("Italic green text in toast");
		text.setSpan(new StyleSpan(Typeface.ITALIC), 0, 18,  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		text.setSpan(new ForegroundColorSpan(Color.GREEN), 0, 18,  Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
	}


}
