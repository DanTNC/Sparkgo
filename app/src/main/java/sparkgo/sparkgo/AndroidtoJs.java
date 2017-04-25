package sparkgo.sparkgo;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */

// 繼承自Object類
public class AndroidtoJs extends Object {
// 定義JS需要呼叫的方法// 被JS呼叫的方法必須加入@JavascriptInterface註解
    Context mContext;

    AndroidtoJs(Context c){
        mContext = c;
    }
    @JavascriptInterface
    public void callJavaMethod() {
        Intent i = new Intent(mContext, FullscreenActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(i);
    }
}
