package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout.C0321a;
import android.view.View;

/* renamed from: android.support.constraint.g */
/* compiled from: Placeholder */
public class C0367g extends View {

    /* renamed from: a */
    private int f1223a;

    /* renamed from: b */
    private View f1224b;

    /* renamed from: c */
    private int f1225c;

    /* renamed from: a */
    public void mo1343a(ConstraintLayout constraintLayout) {
        if (this.f1224b != null) {
            C0321a aVar = (C0321a) getLayoutParams();
            C0321a aVar2 = (C0321a) this.f1224b.getLayoutParams();
            aVar2.f822la.mo1189n(0);
            aVar.f822la.mo1191o(aVar2.f822la.mo1198s());
            aVar.f822la.mo1175g(aVar2.f822la.mo1178i());
            aVar2.f822la.mo1189n(8);
        }
    }

    /* renamed from: b */
    public void mo1344b(ConstraintLayout constraintLayout) {
        if (this.f1223a == -1 && !isInEditMode()) {
            setVisibility(this.f1225c);
        }
        this.f1224b = constraintLayout.findViewById(this.f1223a);
        View view = this.f1224b;
        if (view != null) {
            ((C0321a) view.getLayoutParams()).f800aa = true;
            this.f1224b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1224b;
    }

    public int getEmptyVisibility() {
        return this.f1225c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, 1, rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        if (this.f1223a != i) {
            View view = this.f1224b;
            if (view != null) {
                view.setVisibility(0);
                ((C0321a) this.f1224b.getLayoutParams()).f800aa = false;
                this.f1224b = null;
            }
            this.f1223a = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1225c = i;
    }
}
