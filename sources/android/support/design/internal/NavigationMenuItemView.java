package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.p044v4.graphics.drawable.C0575a;
import android.support.p044v4.view.C0668d;
import android.support.p044v4.view.C0697y;
import android.support.p044v4.widget.C0722n;
import android.support.p047v7.view.menu.C0816p;
import android.support.p047v7.view.menu.C0829w.C0830a;
import android.support.p047v7.widget.C1055oa.C1056a;
import android.support.p047v7.widget.C1094yb;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import p000a.p005b.p008c.C0035c;
import p000a.p005b.p008c.C0048d;
import p000a.p005b.p008c.C0052e;
import p000a.p005b.p008c.C0056g;
import p000a.p005b.p022f.p023a.p024a.C0172h;
import p000a.p005b.p033g.p034a.C0244a;

public class NavigationMenuItemView extends C0377a implements C0830a {

    /* renamed from: v */
    private static final int[] f1251v = {16842912};

    /* renamed from: A */
    private FrameLayout f1252A;

    /* renamed from: B */
    private C0816p f1253B;

    /* renamed from: C */
    private ColorStateList f1254C;

    /* renamed from: D */
    private boolean f1255D;

    /* renamed from: E */
    private Drawable f1256E;

    /* renamed from: F */
    private final C0668d f1257F;

    /* renamed from: w */
    private final int f1258w;

    /* renamed from: x */
    private boolean f1259x;

    /* renamed from: y */
    boolean f1260y;

    /* renamed from: z */
    private final CheckedTextView f1261z;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m1393b() {
        if (m1395d()) {
            this.f1261z.setVisibility(8);
            FrameLayout frameLayout = this.f1252A;
            if (frameLayout != null) {
                C1056a aVar = (C1056a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f1252A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f1261z.setVisibility(0);
        FrameLayout frameLayout2 = this.f1252A;
        if (frameLayout2 != null) {
            C1056a aVar2 = (C1056a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f1252A.setLayoutParams(aVar2);
        }
    }

    /* renamed from: c */
    private StateListDrawable m1394c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0244a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f1251v, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: d */
    private boolean m1395d() {
        return this.f1253B.getTitle() == null && this.f1253B.getIcon() == null && this.f1253B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1252A == null) {
                this.f1252A = (FrameLayout) ((ViewStub) findViewById(C0052e.design_menu_item_action_area_stub)).inflate();
            }
            this.f1252A.removeAllViews();
            this.f1252A.addView(view);
        }
    }

    /* renamed from: a */
    public void mo1399a(C0816p pVar, int i) {
        this.f1253B = pVar;
        setVisibility(pVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0697y.m2968a((View) this, (Drawable) m1394c());
        }
        setCheckable(pVar.isCheckable());
        setChecked(pVar.isChecked());
        setEnabled(pVar.isEnabled());
        setTitle(pVar.getTitle());
        setIcon(pVar.getIcon());
        setActionView(pVar.getActionView());
        setContentDescription(pVar.getContentDescription());
        C1094yb.m5617a(this, pVar.getTooltipText());
        m1393b();
    }

    /* renamed from: a */
    public boolean mo1400a() {
        return false;
    }

    public C0816p getItemData() {
        return this.f1253B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0816p pVar = this.f1253B;
        if (pVar != null && pVar.isCheckable() && this.f1253B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f1251v);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f1260y != z) {
            this.f1260y = z;
            this.f1257F.mo2734a((View) this.f1261z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f1261z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1255D) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0575a.m2572h(drawable).mutate();
                C0575a.m2558a(drawable, this.f1254C);
            }
            int i = this.f1258w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1259x) {
            if (this.f1256E == null) {
                this.f1256E = C0172h.m500a(getResources(), C0048d.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.f1256E;
                if (drawable2 != null) {
                    int i2 = this.f1258w;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1256E;
        }
        C0722n.m3148a(this.f1261z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1261z.setCompoundDrawablePadding(i);
    }

    /* access modifiers changed from: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f1254C = colorStateList;
        this.f1255D = this.f1254C != null;
        C0816p pVar = this.f1253B;
        if (pVar != null) {
            setIcon(pVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f1259x = z;
    }

    public void setTextAppearance(int i) {
        C0722n.m3154d(this.f1261z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1261z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1261z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1257F = new C0378b(this);
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0056g.design_navigation_menu_item, this, true);
        this.f1258w = context.getResources().getDimensionPixelSize(C0035c.design_navigation_icon_size);
        this.f1261z = (CheckedTextView) findViewById(C0052e.design_menu_item_text);
        this.f1261z.setDuplicateParentStateEnabled(true);
        C0697y.m2969a((View) this.f1261z, this.f1257F);
    }
}
