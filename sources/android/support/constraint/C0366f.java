package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout.C0321a;
import android.view.View;

/* renamed from: android.support.constraint.f */
/* compiled from: Guideline */
public class C0366f extends View {
    public C0366f(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0321a aVar = (C0321a) getLayoutParams();
        aVar.f799a = i;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i) {
        C0321a aVar = (C0321a) getLayoutParams();
        aVar.f801b = i;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        C0321a aVar = (C0321a) getLayoutParams();
        aVar.f803c = f;
        setLayoutParams(aVar);
    }

    public void setVisibility(int i) {
    }
}
