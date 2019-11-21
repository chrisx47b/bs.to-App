package android.support.design.theme;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.p047v7.app.AppCompatViewInflater;
import android.support.p047v7.widget.C1038l;
import android.util.AttributeSet;
import p000a.p005b.p008c.p010b.C0032a;

@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* access modifiers changed from: protected */
    public C1038l createButton(Context context, AttributeSet attributeSet) {
        return new C0032a(context, attributeSet);
    }
}
