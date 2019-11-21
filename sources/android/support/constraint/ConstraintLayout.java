package android.support.constraint;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.constraint.p042a.C0355f;
import android.support.constraint.p042a.p043a.C0335h;
import android.support.constraint.p042a.p043a.C0335h.C0336a;
import android.support.constraint.p042a.p043a.C0337i;
import android.support.constraint.p042a.p043a.C0340l;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f753a = new SparseArray<>();

    /* renamed from: b */
    private ArrayList<C0360b> f754b = new ArrayList<>(4);

    /* renamed from: c */
    private final ArrayList<C0335h> f755c = new ArrayList<>(100);

    /* renamed from: d */
    C0337i f756d = new C0337i();

    /* renamed from: e */
    private int f757e = 0;

    /* renamed from: f */
    private int f758f = 0;

    /* renamed from: g */
    private int f759g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f760h = Integer.MAX_VALUE;

    /* renamed from: i */
    private boolean f761i = true;

    /* renamed from: j */
    private int f762j = 7;

    /* renamed from: k */
    private C0362d f763k = null;

    /* renamed from: l */
    private int f764l = -1;

    /* renamed from: m */
    private HashMap<String, Integer> f765m = new HashMap<>();

    /* renamed from: n */
    private int f766n = -1;

    /* renamed from: o */
    private int f767o = -1;

    /* renamed from: p */
    int f768p = -1;

    /* renamed from: q */
    int f769q = -1;

    /* renamed from: r */
    int f770r = 0;

    /* renamed from: s */
    int f771s = 0;

    /* renamed from: t */
    private C0355f f772t;

    /* renamed from: android.support.constraint.ConstraintLayout$a */
    public static class C0321a extends MarginLayoutParams {

        /* renamed from: A */
        public float f773A = 0.5f;

        /* renamed from: B */
        public String f774B = null;

        /* renamed from: C */
        float f775C = 0.0f;

        /* renamed from: D */
        int f776D = 1;

        /* renamed from: E */
        public float f777E = -1.0f;

        /* renamed from: F */
        public float f778F = -1.0f;

        /* renamed from: G */
        public int f779G = 0;

        /* renamed from: H */
        public int f780H = 0;

        /* renamed from: I */
        public int f781I = 0;

        /* renamed from: J */
        public int f782J = 0;

        /* renamed from: K */
        public int f783K = 0;

        /* renamed from: L */
        public int f784L = 0;

        /* renamed from: M */
        public int f785M = 0;

        /* renamed from: N */
        public int f786N = 0;

        /* renamed from: O */
        public float f787O = 1.0f;

        /* renamed from: P */
        public float f788P = 1.0f;

        /* renamed from: Q */
        public int f789Q = -1;

        /* renamed from: R */
        public int f790R = -1;

        /* renamed from: S */
        public int f791S = -1;

        /* renamed from: T */
        public boolean f792T = false;

        /* renamed from: U */
        public boolean f793U = false;

        /* renamed from: V */
        boolean f794V = true;

        /* renamed from: W */
        boolean f795W = true;

        /* renamed from: X */
        boolean f796X = false;

        /* renamed from: Y */
        boolean f797Y = false;

        /* renamed from: Z */
        boolean f798Z = false;

        /* renamed from: a */
        public int f799a = -1;

        /* renamed from: aa */
        boolean f800aa = false;

        /* renamed from: b */
        public int f801b = -1;

        /* renamed from: ba */
        int f802ba = -1;

        /* renamed from: c */
        public float f803c = -1.0f;

        /* renamed from: ca */
        int f804ca = -1;

        /* renamed from: d */
        public int f805d = -1;

        /* renamed from: da */
        int f806da = -1;

        /* renamed from: e */
        public int f807e = -1;

        /* renamed from: ea */
        int f808ea = -1;

        /* renamed from: f */
        public int f809f = -1;

        /* renamed from: fa */
        int f810fa = -1;

        /* renamed from: g */
        public int f811g = -1;

        /* renamed from: ga */
        int f812ga = -1;

        /* renamed from: h */
        public int f813h = -1;

        /* renamed from: ha */
        float f814ha = 0.5f;

        /* renamed from: i */
        public int f815i = -1;

        /* renamed from: ia */
        int f816ia;

        /* renamed from: j */
        public int f817j = -1;

        /* renamed from: ja */
        int f818ja;

        /* renamed from: k */
        public int f819k = -1;

        /* renamed from: ka */
        float f820ka;

        /* renamed from: l */
        public int f821l = -1;

        /* renamed from: la */
        C0335h f822la = new C0335h();

        /* renamed from: m */
        public int f823m = -1;

        /* renamed from: ma */
        public boolean f824ma = false;

        /* renamed from: n */
        public int f825n = 0;

        /* renamed from: o */
        public float f826o = 0.0f;

        /* renamed from: p */
        public int f827p = -1;

        /* renamed from: q */
        public int f828q = -1;

        /* renamed from: r */
        public int f829r = -1;

        /* renamed from: s */
        public int f830s = -1;

        /* renamed from: t */
        public int f831t = -1;

        /* renamed from: u */
        public int f832u = -1;

        /* renamed from: v */
        public int f833v = -1;

        /* renamed from: w */
        public int f834w = -1;

        /* renamed from: x */
        public int f835x = -1;

        /* renamed from: y */
        public int f836y = -1;

        /* renamed from: z */
        public float f837z = 0.5f;

        /* renamed from: android.support.constraint.ConstraintLayout$a$a */
        private static class C0322a {

            /* renamed from: a */
            public static final SparseIntArray f838a = new SparseIntArray();

            static {
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f838a.append(C0369i.ConstraintLayout_Layout_android_orientation, 1);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f838a.append(C0369i.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public C0321a(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0369i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                String str = "ConstraintLayout";
                switch (C0322a.f838a.get(index)) {
                    case 1:
                        this.f791S = obtainStyledAttributes.getInt(index, this.f791S);
                        break;
                    case 2:
                        this.f823m = obtainStyledAttributes.getResourceId(index, this.f823m);
                        if (this.f823m != -1) {
                            break;
                        } else {
                            this.f823m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f825n = obtainStyledAttributes.getDimensionPixelSize(index, this.f825n);
                        break;
                    case 4:
                        this.f826o = obtainStyledAttributes.getFloat(index, this.f826o) % 360.0f;
                        float f = this.f826o;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f826o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f799a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f799a);
                        break;
                    case 6:
                        this.f801b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f801b);
                        break;
                    case 7:
                        this.f803c = obtainStyledAttributes.getFloat(index, this.f803c);
                        break;
                    case 8:
                        this.f805d = obtainStyledAttributes.getResourceId(index, this.f805d);
                        if (this.f805d != -1) {
                            break;
                        } else {
                            this.f805d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.f807e = obtainStyledAttributes.getResourceId(index, this.f807e);
                        if (this.f807e != -1) {
                            break;
                        } else {
                            this.f807e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f809f = obtainStyledAttributes.getResourceId(index, this.f809f);
                        if (this.f809f != -1) {
                            break;
                        } else {
                            this.f809f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.f811g = obtainStyledAttributes.getResourceId(index, this.f811g);
                        if (this.f811g != -1) {
                            break;
                        } else {
                            this.f811g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.f813h = obtainStyledAttributes.getResourceId(index, this.f813h);
                        if (this.f813h != -1) {
                            break;
                        } else {
                            this.f813h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.f815i = obtainStyledAttributes.getResourceId(index, this.f815i);
                        if (this.f815i != -1) {
                            break;
                        } else {
                            this.f815i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.f817j = obtainStyledAttributes.getResourceId(index, this.f817j);
                        if (this.f817j != -1) {
                            break;
                        } else {
                            this.f817j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.f819k = obtainStyledAttributes.getResourceId(index, this.f819k);
                        if (this.f819k != -1) {
                            break;
                        } else {
                            this.f819k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.f821l = obtainStyledAttributes.getResourceId(index, this.f821l);
                        if (this.f821l != -1) {
                            break;
                        } else {
                            this.f821l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.f827p = obtainStyledAttributes.getResourceId(index, this.f827p);
                        if (this.f827p != -1) {
                            break;
                        } else {
                            this.f827p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.f828q = obtainStyledAttributes.getResourceId(index, this.f828q);
                        if (this.f828q != -1) {
                            break;
                        } else {
                            this.f828q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.f829r = obtainStyledAttributes.getResourceId(index, this.f829r);
                        if (this.f829r != -1) {
                            break;
                        } else {
                            this.f829r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.f830s = obtainStyledAttributes.getResourceId(index, this.f830s);
                        if (this.f830s != -1) {
                            break;
                        } else {
                            this.f830s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f831t = obtainStyledAttributes.getDimensionPixelSize(index, this.f831t);
                        break;
                    case 22:
                        this.f832u = obtainStyledAttributes.getDimensionPixelSize(index, this.f832u);
                        break;
                    case 23:
                        this.f833v = obtainStyledAttributes.getDimensionPixelSize(index, this.f833v);
                        break;
                    case 24:
                        this.f834w = obtainStyledAttributes.getDimensionPixelSize(index, this.f834w);
                        break;
                    case 25:
                        this.f835x = obtainStyledAttributes.getDimensionPixelSize(index, this.f835x);
                        break;
                    case 26:
                        this.f836y = obtainStyledAttributes.getDimensionPixelSize(index, this.f836y);
                        break;
                    case 27:
                        this.f792T = obtainStyledAttributes.getBoolean(index, this.f792T);
                        break;
                    case 28:
                        this.f793U = obtainStyledAttributes.getBoolean(index, this.f793U);
                        break;
                    case 29:
                        this.f837z = obtainStyledAttributes.getFloat(index, this.f837z);
                        break;
                    case 30:
                        this.f773A = obtainStyledAttributes.getFloat(index, this.f773A);
                        break;
                    case 31:
                        this.f781I = obtainStyledAttributes.getInt(index, 0);
                        if (this.f781I != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        this.f782J = obtainStyledAttributes.getInt(index, 0);
                        if (this.f782J != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f783K = obtainStyledAttributes.getDimensionPixelSize(index, this.f783K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f783K) != -2) {
                                break;
                            } else {
                                this.f783K = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f785M = obtainStyledAttributes.getDimensionPixelSize(index, this.f785M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f785M) != -2) {
                                break;
                            } else {
                                this.f785M = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f787O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f787O));
                        break;
                    case 36:
                        try {
                            this.f784L = obtainStyledAttributes.getDimensionPixelSize(index, this.f784L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f784L) != -2) {
                                break;
                            } else {
                                this.f784L = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f786N = obtainStyledAttributes.getDimensionPixelSize(index, this.f786N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f786N) != -2) {
                                break;
                            } else {
                                this.f786N = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f788P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f788P));
                        break;
                    case 44:
                        this.f774B = obtainStyledAttributes.getString(index);
                        this.f775C = Float.NaN;
                        this.f776D = -1;
                        String str2 = this.f774B;
                        if (str2 == null) {
                            break;
                        } else {
                            int length = str2.length();
                            int indexOf = this.f774B.indexOf(44);
                            if (indexOf <= 0 || indexOf >= length - 1) {
                                i = 0;
                            } else {
                                String substring = this.f774B.substring(0, indexOf);
                                if (substring.equalsIgnoreCase("W")) {
                                    this.f776D = 0;
                                } else if (substring.equalsIgnoreCase("H")) {
                                    this.f776D = 1;
                                }
                                i = indexOf + 1;
                            }
                            int indexOf2 = this.f774B.indexOf(58);
                            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                String substring2 = this.f774B.substring(i, indexOf2);
                                String substring3 = this.f774B.substring(indexOf2 + 1);
                                if (substring2.length() > 0 && substring3.length() > 0) {
                                    try {
                                        float parseFloat = Float.parseFloat(substring2);
                                        float parseFloat2 = Float.parseFloat(substring3);
                                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                            if (this.f776D != 1) {
                                                this.f775C = Math.abs(parseFloat / parseFloat2);
                                                break;
                                            } else {
                                                this.f775C = Math.abs(parseFloat2 / parseFloat);
                                                break;
                                            }
                                        }
                                    } catch (NumberFormatException unused5) {
                                        break;
                                    }
                                }
                            } else {
                                String substring4 = this.f774B.substring(i);
                                if (substring4.length() <= 0) {
                                    break;
                                } else {
                                    this.f775C = Float.parseFloat(substring4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 45:
                        this.f777E = obtainStyledAttributes.getFloat(index, this.f777E);
                        break;
                    case 46:
                        this.f778F = obtainStyledAttributes.getFloat(index, this.f778F);
                        break;
                    case 47:
                        this.f779G = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 48:
                        this.f780H = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 49:
                        this.f789Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f789Q);
                        break;
                    case 50:
                        this.f790R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f790R);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
            mo1085a();
        }

        /* renamed from: a */
        public void mo1085a() {
            this.f797Y = false;
            this.f794V = true;
            this.f795W = true;
            if (this.width == -2 && this.f792T) {
                this.f794V = false;
                this.f781I = 1;
            }
            if (this.height == -2 && this.f793U) {
                this.f795W = false;
                this.f782J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f794V = false;
                if (this.width == 0 && this.f781I == 1) {
                    this.width = -2;
                    this.f792T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f795W = false;
                if (this.height == 0 && this.f782J == 1) {
                    this.height = -2;
                    this.f793U = true;
                }
            }
            if (this.f803c != -1.0f || this.f799a != -1 || this.f801b != -1) {
                this.f797Y = true;
                this.f794V = true;
                this.f795W = true;
                if (!(this.f822la instanceof C0340l)) {
                    this.f822la = new C0340l();
                }
                ((C0340l) this.f822la).mo1232v(this.f791S);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.f806da = r7
                r6.f808ea = r7
                r6.f802ba = r7
                r6.f804ca = r7
                r6.f810fa = r7
                r6.f812ga = r7
                int r2 = r6.f831t
                r6.f810fa = r2
                int r2 = r6.f833v
                r6.f812ga = r2
                float r2 = r6.f837z
                r6.f814ha = r2
                int r2 = r6.f799a
                r6.f816ia = r2
                int r2 = r6.f801b
                r6.f818ja = r2
                float r2 = r6.f803c
                r6.f820ka = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x009a
                int r2 = r6.f827p
                if (r2 == r7) goto L_0x0041
                r6.f806da = r2
            L_0x003f:
                r3 = 1
                goto L_0x0048
            L_0x0041:
                int r2 = r6.f828q
                if (r2 == r7) goto L_0x0048
                r6.f808ea = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.f829r
                if (r2 == r7) goto L_0x004f
                r6.f804ca = r2
                r3 = 1
            L_0x004f:
                int r2 = r6.f830s
                if (r2 == r7) goto L_0x0056
                r6.f802ba = r2
                r3 = 1
            L_0x0056:
                int r2 = r6.f835x
                if (r2 == r7) goto L_0x005c
                r6.f812ga = r2
            L_0x005c:
                int r2 = r6.f836y
                if (r2 == r7) goto L_0x0062
                r6.f810fa = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.f837z
                float r3 = r2 - r3
                r6.f814ha = r3
            L_0x006c:
                boolean r3 = r6.f797Y
                if (r3 == 0) goto L_0x00be
                int r3 = r6.f791S
                if (r3 != r4) goto L_0x00be
                float r3 = r6.f803c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.f820ka = r2
                r6.f816ia = r7
                r6.f818ja = r7
                goto L_0x00be
            L_0x0084:
                int r2 = r6.f799a
                if (r2 == r7) goto L_0x008f
                r6.f818ja = r2
                r6.f816ia = r7
                r6.f820ka = r4
                goto L_0x00be
            L_0x008f:
                int r2 = r6.f801b
                if (r2 == r7) goto L_0x00be
                r6.f816ia = r2
                r6.f818ja = r7
                r6.f820ka = r4
                goto L_0x00be
            L_0x009a:
                int r2 = r6.f827p
                if (r2 == r7) goto L_0x00a0
                r6.f804ca = r2
            L_0x00a0:
                int r2 = r6.f828q
                if (r2 == r7) goto L_0x00a6
                r6.f802ba = r2
            L_0x00a6:
                int r2 = r6.f829r
                if (r2 == r7) goto L_0x00ac
                r6.f806da = r2
            L_0x00ac:
                int r2 = r6.f830s
                if (r2 == r7) goto L_0x00b2
                r6.f808ea = r2
            L_0x00b2:
                int r2 = r6.f835x
                if (r2 == r7) goto L_0x00b8
                r6.f810fa = r2
            L_0x00b8:
                int r2 = r6.f836y
                if (r2 == r7) goto L_0x00be
                r6.f812ga = r2
            L_0x00be:
                int r2 = r6.f829r
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f830s
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f828q
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f827p
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f809f
                if (r2 == r7) goto L_0x00dd
                r6.f806da = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r6.rightMargin = r1
                goto L_0x00eb
            L_0x00dd:
                int r2 = r6.f811g
                if (r2 == r7) goto L_0x00eb
                r6.f808ea = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r6.rightMargin = r1
            L_0x00eb:
                int r1 = r6.f805d
                if (r1 == r7) goto L_0x00fa
                r6.f802ba = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r6.leftMargin = r0
                goto L_0x0108
            L_0x00fa:
                int r1 = r6.f807e
                if (r1 == r7) goto L_0x0108
                r6.f804ca = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r6.leftMargin = r0
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.C0321a.resolveLayoutDirection(int):void");
        }

        public C0321a(int i, int i2) {
            super(i, i2);
        }

        public C0321a(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m1018a((AttributeSet) null);
    }

    /* renamed from: b */
    private void m1020b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f755c.clear();
            m1016a();
        }
    }

    /* renamed from: c */
    private void m1022c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0367g) {
                ((C0367g) childAt).mo1343a(this);
            }
        }
        int size = this.f754b.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((C0360b) this.f754b.get(i2)).mo1320b(this);
            }
        }
    }

    /* renamed from: a */
    public void mo1058a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f765m == null) {
                this.f765m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f765m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0321a;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) i2;
                            float f2 = (float) (i2 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) i3;
                            float f4 = f;
                            float f5 = f;
                            float f6 = f3;
                            Paint paint2 = paint;
                            float f7 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f6, f7, f3, paint3);
                            float f8 = (float) (i3 + parseInt4);
                            float f9 = f2;
                            float f10 = f8;
                            canvas2.drawLine(f9, f6, f7, f10, paint3);
                            float f11 = f8;
                            float f12 = f5;
                            canvas2.drawLine(f9, f11, f12, f10, paint3);
                            float f13 = f5;
                            canvas2.drawLine(f13, f11, f12, f3, paint3);
                            Paint paint4 = paint2;
                            paint4.setColor(-16711936);
                            Paint paint5 = paint4;
                            float f14 = f2;
                            Paint paint6 = paint5;
                            canvas2.drawLine(f13, f3, f14, f8, paint6);
                            canvas2.drawLine(f13, f8, f14, f3, paint6);
                        }
                    }
                }
            }
        }
    }

    public int getMaxHeight() {
        return this.f760h;
    }

    public int getMaxWidth() {
        return this.f759g;
    }

    public int getMinHeight() {
        return this.f758f;
    }

    public int getMinWidth() {
        return this.f757e;
    }

    public int getOptimizationLevel() {
        return this.f756d.mo1209M();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0321a aVar = (C0321a) childAt.getLayoutParams();
            C0335h hVar = aVar.f822la;
            if ((childAt.getVisibility() != 8 || aVar.f797Y || aVar.f798Z || isInEditMode) && !aVar.f800aa) {
                int g = hVar.mo1174g();
                int h = hVar.mo1176h();
                int s = hVar.mo1198s() + g;
                int i6 = hVar.mo1178i() + h;
                childAt.layout(g, h, s, i6);
                if (childAt instanceof C0367g) {
                    View content = ((C0367g) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(g, h, s, i6);
                    }
                }
            }
        }
        int size = this.f754b.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((C0360b) this.f754b.get(i7)).mo1319a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r25)
            int r4 = android.view.View.MeasureSpec.getSize(r25)
            int r5 = android.view.View.MeasureSpec.getMode(r26)
            int r6 = android.view.View.MeasureSpec.getSize(r26)
            int r7 = r24.getPaddingLeft()
            int r8 = r24.getPaddingTop()
            android.support.constraint.a.a.i r9 = r0.f756d
            r9.mo1197r(r7)
            android.support.constraint.a.a.i r9 = r0.f756d
            r9.mo1199s(r8)
            android.support.constraint.a.a.i r9 = r0.f756d
            int r10 = r0.f759g
            r9.mo1181j(r10)
            android.support.constraint.a.a.i r9 = r0.f756d
            int r10 = r0.f760h
            r9.mo1179i(r10)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 0
            r11 = 1
            r12 = 17
            if (r9 < r12) goto L_0x004f
            android.support.constraint.a.a.i r9 = r0.f756d
            int r12 = r24.getLayoutDirection()
            if (r12 != r11) goto L_0x004b
            r12 = 1
            goto L_0x004c
        L_0x004b:
            r12 = 0
        L_0x004c:
            r9.mo1220c(r12)
        L_0x004f:
            r24.m1023c(r25, r26)
            android.support.constraint.a.a.i r9 = r0.f756d
            int r9 = r9.mo1198s()
            android.support.constraint.a.a.i r12 = r0.f756d
            int r12 = r12.mo1178i()
            boolean r13 = r0.f761i
            if (r13 == 0) goto L_0x0069
            r0.f761i = r10
            r24.m1020b()
            r13 = 1
            goto L_0x006a
        L_0x0069:
            r13 = 0
        L_0x006a:
            int r14 = r0.f762j
            r15 = 8
            r14 = r14 & r15
            if (r14 != r15) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r14 == 0) goto L_0x0084
            android.support.constraint.a.a.i r15 = r0.f756d
            r15.mo1216T()
            android.support.constraint.a.a.i r15 = r0.f756d
            r15.mo1222f(r9, r12)
            r24.m1021b(r25, r26)
            goto L_0x0087
        L_0x0084:
            r24.m1017a(r25, r26)
        L_0x0087:
            r24.m1022c()
            int r15 = r24.getChildCount()
            if (r15 <= 0) goto L_0x0097
            if (r13 == 0) goto L_0x0097
            android.support.constraint.a.a.i r13 = r0.f756d
            android.support.constraint.p042a.p043a.C0325a.m1052a(r13)
        L_0x0097:
            android.support.constraint.a.a.i r13 = r0.f756d
            boolean r15 = r13.f989Ia
            if (r15 == 0) goto L_0x00c9
            boolean r15 = r13.f990Ja
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == 0) goto L_0x00b3
            if (r3 != r11) goto L_0x00b3
            int r15 = r13.f992La
            if (r15 >= r4) goto L_0x00ac
            r13.mo1191o(r15)
        L_0x00ac:
            android.support.constraint.a.a.i r13 = r0.f756d
            android.support.constraint.a.a.h$a r15 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            r13.mo1143a(r15)
        L_0x00b3:
            android.support.constraint.a.a.i r13 = r0.f756d
            boolean r15 = r13.f991Ka
            if (r15 == 0) goto L_0x00c9
            if (r5 != r11) goto L_0x00c9
            int r11 = r13.f993Ma
            if (r11 >= r6) goto L_0x00c2
            r13.mo1175g(r11)
        L_0x00c2:
            android.support.constraint.a.a.i r11 = r0.f756d
            android.support.constraint.a.a.h$a r13 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            r11.mo1156b(r13)
        L_0x00c9:
            int r11 = r0.f762j
            r13 = 32
            r11 = r11 & r13
            r15 = 1073741824(0x40000000, float:2.0)
            if (r11 != r13) goto L_0x011d
            android.support.constraint.a.a.i r11 = r0.f756d
            int r11 = r11.mo1198s()
            android.support.constraint.a.a.i r13 = r0.f756d
            int r13 = r13.mo1178i()
            int r10 = r0.f766n
            if (r10 == r11) goto L_0x00ec
            if (r3 != r15) goto L_0x00ec
            android.support.constraint.a.a.i r3 = r0.f756d
            java.util.List<android.support.constraint.a.a.j> r3 = r3.f988Ha
            r10 = 0
            android.support.constraint.p042a.p043a.C0325a.m1054a(r3, r10, r11)
        L_0x00ec:
            int r3 = r0.f767o
            if (r3 == r13) goto L_0x00fa
            if (r5 != r15) goto L_0x00fa
            android.support.constraint.a.a.i r3 = r0.f756d
            java.util.List<android.support.constraint.a.a.j> r3 = r3.f988Ha
            r5 = 1
            android.support.constraint.p042a.p043a.C0325a.m1054a(r3, r5, r13)
        L_0x00fa:
            android.support.constraint.a.a.i r3 = r0.f756d
            boolean r5 = r3.f990Ja
            if (r5 == 0) goto L_0x010b
            int r5 = r3.f992La
            if (r5 <= r4) goto L_0x010b
            java.util.List<android.support.constraint.a.a.j> r3 = r3.f988Ha
            r10 = 0
            android.support.constraint.p042a.p043a.C0325a.m1054a(r3, r10, r4)
            goto L_0x010c
        L_0x010b:
            r10 = 0
        L_0x010c:
            android.support.constraint.a.a.i r3 = r0.f756d
            boolean r4 = r3.f991Ka
            if (r4 == 0) goto L_0x011d
            int r4 = r3.f993Ma
            if (r4 <= r6) goto L_0x011d
            java.util.List<android.support.constraint.a.a.j> r3 = r3.f988Ha
            r4 = 1
            android.support.constraint.p042a.p043a.C0325a.m1054a(r3, r4, r6)
            goto L_0x011e
        L_0x011d:
            r4 = 1
        L_0x011e:
            int r3 = r24.getChildCount()
            if (r3 <= 0) goto L_0x0129
            java.lang.String r3 = "First pass"
            r0.mo1059a(r3)
        L_0x0129:
            java.util.ArrayList<android.support.constraint.a.a.h> r3 = r0.f755c
            int r3 = r3.size()
            int r5 = r24.getPaddingBottom()
            int r8 = r8 + r5
            int r5 = r24.getPaddingRight()
            int r7 = r7 + r5
            if (r3 <= 0) goto L_0x035b
            android.support.constraint.a.a.i r6 = r0.f756d
            android.support.constraint.a.a.h$a r6 = r6.mo1180j()
            android.support.constraint.a.a.h$a r11 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r6 != r11) goto L_0x0147
            r6 = 1
            goto L_0x0148
        L_0x0147:
            r6 = 0
        L_0x0148:
            android.support.constraint.a.a.i r11 = r0.f756d
            android.support.constraint.a.a.h$a r11 = r11.mo1194q()
            android.support.constraint.a.a.h$a r13 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r11 != r13) goto L_0x0154
            r11 = 1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            android.support.constraint.a.a.i r13 = r0.f756d
            int r13 = r13.mo1198s()
            int r4 = r0.f757e
            int r4 = java.lang.Math.max(r13, r4)
            android.support.constraint.a.a.i r13 = r0.f756d
            int r13 = r13.mo1178i()
            int r10 = r0.f758f
            int r10 = java.lang.Math.max(r13, r10)
            r13 = r4
            r5 = r10
            r4 = 0
            r10 = 0
            r17 = 0
        L_0x0173:
            r18 = 1
            if (r4 >= r3) goto L_0x02b4
            java.util.ArrayList<android.support.constraint.a.a.h> r15 = r0.f755c
            java.lang.Object r15 = r15.get(r4)
            android.support.constraint.a.a.h r15 = (android.support.constraint.p042a.p043a.C0335h) r15
            java.lang.Object r20 = r15.mo1170e()
            r21 = r3
            r3 = r20
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L_0x0193
            r20 = r9
            r23 = r10
            r22 = r12
            goto L_0x02a0
        L_0x0193:
            android.view.ViewGroup$LayoutParams r20 = r3.getLayoutParams()
            r22 = r12
            r12 = r20
            android.support.constraint.ConstraintLayout$a r12 = (android.support.constraint.ConstraintLayout.C0321a) r12
            r20 = r9
            boolean r9 = r12.f798Z
            if (r9 != 0) goto L_0x029e
            boolean r9 = r12.f797Y
            if (r9 == 0) goto L_0x01a9
            goto L_0x029e
        L_0x01a9:
            int r9 = r3.getVisibility()
            r23 = r10
            r10 = 8
            if (r9 != r10) goto L_0x01b5
        L_0x01b3:
            goto L_0x02a0
        L_0x01b5:
            if (r14 == 0) goto L_0x01cc
            android.support.constraint.a.a.q r9 = r15.mo1186m()
            boolean r9 = r9.mo1253c()
            if (r9 == 0) goto L_0x01cc
            android.support.constraint.a.a.q r9 = r15.mo1184l()
            boolean r9 = r9.mo1253c()
            if (r9 == 0) goto L_0x01cc
            goto L_0x01b3
        L_0x01cc:
            int r9 = r12.width
            r10 = -2
            if (r9 != r10) goto L_0x01dc
            boolean r9 = r12.f794V
            if (r9 == 0) goto L_0x01dc
            int r9 = r12.width
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r1, r7, r9)
            goto L_0x01e6
        L_0x01dc:
            int r9 = r15.mo1198s()
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
        L_0x01e6:
            int r10 = r12.height
            r1 = -2
            if (r10 != r1) goto L_0x01f6
            boolean r1 = r12.f795W
            if (r1 == 0) goto L_0x01f6
            int r1 = r12.height
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r2, r8, r1)
            goto L_0x0200
        L_0x01f6:
            int r1 = r15.mo1178i()
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
        L_0x0200:
            r3.measure(r9, r1)
            android.support.constraint.a.f r1 = r0.f772t
            if (r1 == 0) goto L_0x020d
            long r9 = r1.f1082b
            long r9 = r9 + r18
            r1.f1082b = r9
        L_0x020d:
            int r1 = r3.getMeasuredWidth()
            int r9 = r3.getMeasuredHeight()
            int r10 = r15.mo1198s()
            if (r1 == r10) goto L_0x0244
            r15.mo1191o(r1)
            if (r14 == 0) goto L_0x0227
            android.support.constraint.a.a.q r10 = r15.mo1186m()
            r10.mo1248a(r1)
        L_0x0227:
            if (r6 == 0) goto L_0x0242
            int r1 = r15.mo1188n()
            if (r1 <= r13) goto L_0x0242
            int r1 = r15.mo1188n()
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.RIGHT
            android.support.constraint.a.a.f r10 = r15.mo1136a(r10)
            int r10 = r10.mo1119b()
            int r1 = r1 + r10
            int r13 = java.lang.Math.max(r13, r1)
        L_0x0242:
            r23 = 1
        L_0x0244:
            int r1 = r15.mo1178i()
            if (r9 == r1) goto L_0x0274
            r15.mo1175g(r9)
            if (r14 == 0) goto L_0x0256
            android.support.constraint.a.a.q r1 = r15.mo1184l()
            r1.mo1248a(r9)
        L_0x0256:
            if (r11 == 0) goto L_0x0272
            int r1 = r15.mo1165d()
            if (r1 <= r5) goto L_0x0272
            int r1 = r15.mo1165d()
            android.support.constraint.a.a.f$c r9 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            android.support.constraint.a.a.f r9 = r15.mo1136a(r9)
            int r9 = r9.mo1119b()
            int r1 = r1 + r9
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r1
        L_0x0272:
            r23 = 1
        L_0x0274:
            boolean r1 = r12.f796X
            if (r1 == 0) goto L_0x028a
            int r1 = r3.getBaseline()
            r9 = -1
            if (r1 == r9) goto L_0x028a
            int r9 = r15.mo1160c()
            if (r1 == r9) goto L_0x028a
            r15.mo1173f(r1)
            r23 = 1
        L_0x028a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r9 = 11
            if (r1 < r9) goto L_0x029b
            int r1 = r3.getMeasuredState()
            r3 = r17
            int r17 = android.view.ViewGroup.combineMeasuredStates(r3, r1)
            goto L_0x02a4
        L_0x029b:
            r3 = r17
            goto L_0x02a4
        L_0x029e:
            r23 = r10
        L_0x02a0:
            r3 = r17
            r17 = r3
        L_0x02a4:
            r10 = r23
            int r4 = r4 + 1
            r1 = r25
            r9 = r20
            r3 = r21
            r12 = r22
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0173
        L_0x02b4:
            r21 = r3
            r20 = r9
            r23 = r10
            r22 = r12
            r3 = r17
            if (r23 == 0) goto L_0x0303
            android.support.constraint.a.a.i r1 = r0.f756d
            r4 = r20
            r1.mo1191o(r4)
            android.support.constraint.a.a.i r1 = r0.f756d
            r4 = r22
            r1.mo1175g(r4)
            if (r14 == 0) goto L_0x02d5
            android.support.constraint.a.a.i r1 = r0.f756d
            r1.mo1217U()
        L_0x02d5:
            java.lang.String r1 = "2nd pass"
            r0.mo1059a(r1)
            android.support.constraint.a.a.i r1 = r0.f756d
            int r1 = r1.mo1198s()
            if (r1 >= r13) goto L_0x02e9
            android.support.constraint.a.a.i r1 = r0.f756d
            r1.mo1191o(r13)
            r11 = 1
            goto L_0x02ea
        L_0x02e9:
            r11 = 0
        L_0x02ea:
            android.support.constraint.a.a.i r1 = r0.f756d
            int r1 = r1.mo1178i()
            if (r1 >= r5) goto L_0x02fa
            android.support.constraint.a.a.i r1 = r0.f756d
            r1.mo1175g(r5)
            r16 = 1
            goto L_0x02fc
        L_0x02fa:
            r16 = r11
        L_0x02fc:
            if (r16 == 0) goto L_0x0303
            java.lang.String r1 = "3rd pass"
            r0.mo1059a(r1)
        L_0x0303:
            r1 = r21
            r4 = 0
        L_0x0306:
            if (r4 >= r1) goto L_0x035c
            java.util.ArrayList<android.support.constraint.a.a.h> r5 = r0.f755c
            java.lang.Object r5 = r5.get(r4)
            android.support.constraint.a.a.h r5 = (android.support.constraint.p042a.p043a.C0335h) r5
            java.lang.Object r6 = r5.mo1170e()
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x031d
        L_0x0318:
            r10 = 8
        L_0x031a:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0358
        L_0x031d:
            int r9 = r6.getMeasuredWidth()
            int r10 = r5.mo1198s()
            if (r9 != r10) goto L_0x0331
            int r9 = r6.getMeasuredHeight()
            int r10 = r5.mo1178i()
            if (r9 == r10) goto L_0x0318
        L_0x0331:
            int r9 = r5.mo1196r()
            r10 = 8
            if (r9 == r10) goto L_0x031a
            int r9 = r5.mo1198s()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r5 = r5.mo1178i()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            r6.measure(r9, r5)
            android.support.constraint.a.f r5 = r0.f772t
            if (r5 == 0) goto L_0x0358
            long r12 = r5.f1082b
            long r12 = r12 + r18
            r5.f1082b = r12
        L_0x0358:
            int r4 = r4 + 1
            goto L_0x0306
        L_0x035b:
            r3 = 0
        L_0x035c:
            android.support.constraint.a.a.i r1 = r0.f756d
            int r1 = r1.mo1198s()
            int r1 = r1 + r7
            android.support.constraint.a.a.i r4 = r0.f756d
            int r4 = r4.mo1178i()
            int r4 = r4 + r8
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 11
            if (r5 < r6) goto L_0x03a9
            r5 = r25
            int r1 = android.view.ViewGroup.resolveSizeAndState(r1, r5, r3)
            int r3 = r3 << 16
            int r2 = android.view.ViewGroup.resolveSizeAndState(r4, r2, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f759g
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f760h
            int r2 = java.lang.Math.min(r3, r2)
            android.support.constraint.a.a.i r3 = r0.f756d
            boolean r3 = r3.mo1213Q()
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x0398
            r1 = r1 | r4
        L_0x0398:
            android.support.constraint.a.a.i r3 = r0.f756d
            boolean r3 = r3.mo1211O()
            if (r3 == 0) goto L_0x03a1
            r2 = r2 | r4
        L_0x03a1:
            r0.setMeasuredDimension(r1, r2)
            r0.f766n = r1
            r0.f767o = r2
            goto L_0x03b0
        L_0x03a9:
            r0.setMeasuredDimension(r1, r4)
            r0.f766n = r1
            r0.f767o = r4
        L_0x03b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0335h a = mo1055a(view);
        if ((view instanceof C0366f) && !(a instanceof C0340l)) {
            C0321a aVar = (C0321a) view.getLayoutParams();
            aVar.f822la = new C0340l();
            aVar.f797Y = true;
            ((C0340l) aVar.f822la).mo1232v(aVar.f791S);
        }
        if (view instanceof C0360b) {
            C0360b bVar = (C0360b) view;
            bVar.mo1318a();
            ((C0321a) view.getLayoutParams()).f798Z = true;
            if (!this.f754b.contains(bVar)) {
                this.f754b.add(bVar);
            }
        }
        this.f753a.put(view.getId(), view);
        this.f761i = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f753a.remove(view.getId());
        C0335h a = mo1055a(view);
        this.f756d.mo1260c(a);
        this.f754b.remove(view);
        this.f755c.remove(a);
        this.f761i = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f761i = true;
        this.f766n = -1;
        this.f767o = -1;
        this.f768p = -1;
        this.f769q = -1;
        this.f770r = 0;
        this.f771s = 0;
    }

    public void setConstraintSet(C0362d dVar) {
        this.f763k = dVar;
    }

    public void setId(int i) {
        this.f753a.remove(getId());
        super.setId(i);
        this.f753a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f760h) {
            this.f760h = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f759g) {
            this.f759g = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f758f) {
            this.f758f = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f757e) {
            this.f757e = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f756d.mo1223u(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public C0321a generateDefaultLayoutParams() {
        return new C0321a(-2, -2);
    }

    public C0321a generateLayoutParams(AttributeSet attributeSet) {
        return new C0321a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0321a(layoutParams);
    }

    /* renamed from: b */
    private final C0335h mo12381b(int i) {
        C0335h hVar;
        if (i == 0) {
            return this.f756d;
        }
        View view = (View) this.f753a.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f756d;
        }
        if (view == null) {
            hVar = null;
        } else {
            hVar = ((C0321a) view.getLayoutParams()).f822la;
        }
        return hVar;
    }

    /* renamed from: c */
    private void m1023c(int i, int i2) {
        C0336a aVar;
        int i3;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0336a aVar2 = C0336a.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                aVar = C0336a.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                aVar = aVar2;
            } else {
                i3 = Math.min(this.f759g, size) - paddingLeft;
                aVar = aVar2;
            }
            i3 = 0;
        } else {
            i3 = size;
            aVar = C0336a.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                aVar2 = C0336a.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f760h, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            aVar2 = C0336a.WRAP_CONTENT;
        }
        this.f756d.mo1185l(0);
        this.f756d.mo1183k(0);
        this.f756d.mo1143a(aVar);
        this.f756d.mo1191o(i3);
        this.f756d.mo1156b(aVar2);
        this.f756d.mo1175g(size2);
        this.f756d.mo1185l((this.f757e - getPaddingLeft()) - getPaddingRight());
        this.f756d.mo1183k((this.f758f - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: a */
    public Object mo1057a(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f765m;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f765m.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m1018a(AttributeSet attributeSet) {
        this.f756d.mo1147a((Object) this);
        this.f753a.put(getId(), this);
        this.f763k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0369i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0369i.ConstraintLayout_Layout_android_minWidth) {
                    this.f757e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f757e);
                } else if (index == C0369i.ConstraintLayout_Layout_android_minHeight) {
                    this.f758f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f758f);
                } else if (index == C0369i.ConstraintLayout_Layout_android_maxWidth) {
                    this.f759g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f759g);
                } else if (index == C0369i.ConstraintLayout_Layout_android_maxHeight) {
                    this.f760h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f760h);
                } else if (index == C0369i.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f762j = obtainStyledAttributes.getInt(index, this.f762j);
                } else if (index == C0369i.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f763k = new C0362d();
                        this.f763k.mo1327a(getContext(), resourceId);
                    } catch (NotFoundException unused) {
                        this.f763k = null;
                    }
                    this.f764l = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f756d.mo1223u(this.f762j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02cc  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1021b(int r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r23.getPaddingTop()
            int r4 = r23.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r23.getPaddingLeft()
            int r5 = r23.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r23.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 1
            r10 = 8
            r12 = -2
            if (r7 >= r5) goto L_0x00de
            android.view.View r14 = r0.getChildAt(r7)
            int r15 = r14.getVisibility()
            if (r15 != r10) goto L_0x0030
            goto L_0x00d6
        L_0x0030:
            android.view.ViewGroup$LayoutParams r10 = r14.getLayoutParams()
            android.support.constraint.ConstraintLayout$a r10 = (android.support.constraint.ConstraintLayout.C0321a) r10
            android.support.constraint.a.a.h r15 = r10.f822la
            boolean r6 = r10.f797Y
            if (r6 != 0) goto L_0x00d6
            boolean r6 = r10.f798Z
            if (r6 == 0) goto L_0x0042
            goto L_0x00d6
        L_0x0042:
            int r6 = r14.getVisibility()
            r15.mo1189n(r6)
            int r6 = r10.width
            int r13 = r10.height
            if (r6 == 0) goto L_0x00c6
            if (r13 != 0) goto L_0x0053
            goto L_0x00c6
        L_0x0053:
            if (r6 != r12) goto L_0x0058
            r16 = 1
            goto L_0x005a
        L_0x0058:
            r16 = 0
        L_0x005a:
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r6)
            if (r13 != r12) goto L_0x0063
            r17 = 1
            goto L_0x0065
        L_0x0063:
            r17 = 0
        L_0x0065:
            int r12 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r13)
            r14.measure(r11, r12)
            android.support.constraint.a.f r11 = r0.f772t
            if (r11 == 0) goto L_0x0077
            r12 = r3
            long r2 = r11.f1081a
            long r2 = r2 + r8
            r11.f1081a = r2
            goto L_0x0078
        L_0x0077:
            r12 = r3
        L_0x0078:
            r2 = -2
            if (r6 != r2) goto L_0x007d
            r3 = 1
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            r15.mo1159b(r3)
            if (r13 != r2) goto L_0x0085
            r2 = 1
            goto L_0x0086
        L_0x0085:
            r2 = 0
        L_0x0086:
            r15.mo1149a(r2)
            int r2 = r14.getMeasuredWidth()
            int r3 = r14.getMeasuredHeight()
            r15.mo1191o(r2)
            r15.mo1175g(r3)
            if (r16 == 0) goto L_0x009c
            r15.mo1195q(r2)
        L_0x009c:
            if (r17 == 0) goto L_0x00a1
            r15.mo1193p(r3)
        L_0x00a1:
            boolean r6 = r10.f796X
            if (r6 == 0) goto L_0x00af
            int r6 = r14.getBaseline()
            r8 = -1
            if (r6 == r8) goto L_0x00af
            r15.mo1173f(r6)
        L_0x00af:
            boolean r6 = r10.f794V
            if (r6 == 0) goto L_0x00d7
            boolean r6 = r10.f795W
            if (r6 == 0) goto L_0x00d7
            android.support.constraint.a.a.q r6 = r15.mo1186m()
            r6.mo1248a(r2)
            android.support.constraint.a.a.q r2 = r15.mo1184l()
            r2.mo1248a(r3)
            goto L_0x00d7
        L_0x00c6:
            r12 = r3
            android.support.constraint.a.a.q r2 = r15.mo1186m()
            r2.mo1252b()
            android.support.constraint.a.a.q r2 = r15.mo1184l()
            r2.mo1252b()
            goto L_0x00d7
        L_0x00d6:
            r12 = r3
        L_0x00d7:
            int r7 = r7 + 1
            r2 = r25
            r3 = r12
            goto L_0x001d
        L_0x00de:
            r12 = r3
            android.support.constraint.a.a.i r2 = r0.f756d
            r2.mo1217U()
            r2 = 0
        L_0x00e5:
            if (r2 >= r5) goto L_0x02e2
            android.view.View r3 = r0.getChildAt(r2)
            int r6 = r3.getVisibility()
            if (r6 != r10) goto L_0x00f3
            goto L_0x02ce
        L_0x00f3:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            android.support.constraint.ConstraintLayout$a r6 = (android.support.constraint.ConstraintLayout.C0321a) r6
            android.support.constraint.a.a.h r7 = r6.f822la
            boolean r11 = r6.f797Y
            if (r11 != 0) goto L_0x02ce
            boolean r11 = r6.f798Z
            if (r11 == 0) goto L_0x0105
            goto L_0x02ce
        L_0x0105:
            int r11 = r3.getVisibility()
            r7.mo1189n(r11)
            int r11 = r6.width
            int r13 = r6.height
            if (r11 == 0) goto L_0x0116
            if (r13 == 0) goto L_0x0116
            goto L_0x02ce
        L_0x0116:
            android.support.constraint.a.a.f$c r14 = android.support.constraint.p042a.p043a.C0330f.C0333c.LEFT
            android.support.constraint.a.a.f r14 = r7.mo1136a(r14)
            android.support.constraint.a.a.p r14 = r14.mo1121d()
            android.support.constraint.a.a.f$c r15 = android.support.constraint.p042a.p043a.C0330f.C0333c.RIGHT
            android.support.constraint.a.a.f r15 = r7.mo1136a(r15)
            android.support.constraint.a.a.p r15 = r15.mo1121d()
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.LEFT
            android.support.constraint.a.a.f r10 = r7.mo1136a(r10)
            android.support.constraint.a.a.f r10 = r10.mo1124g()
            if (r10 == 0) goto L_0x0144
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.RIGHT
            android.support.constraint.a.a.f r10 = r7.mo1136a(r10)
            android.support.constraint.a.a.f r10 = r10.mo1124g()
            if (r10 == 0) goto L_0x0144
            r10 = 1
            goto L_0x0145
        L_0x0144:
            r10 = 0
        L_0x0145:
            android.support.constraint.a.a.f$c r8 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            android.support.constraint.a.a.f r8 = r7.mo1136a(r8)
            android.support.constraint.a.a.p r8 = r8.mo1121d()
            android.support.constraint.a.a.f$c r9 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            android.support.constraint.a.a.f r9 = r7.mo1136a(r9)
            android.support.constraint.a.a.p r9 = r9.mo1121d()
            r17 = r5
            android.support.constraint.a.a.f$c r5 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            android.support.constraint.a.a.f r5 = r7.mo1136a(r5)
            android.support.constraint.a.a.f r5 = r5.mo1124g()
            if (r5 == 0) goto L_0x0175
            android.support.constraint.a.a.f$c r5 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            android.support.constraint.a.a.f r5 = r7.mo1136a(r5)
            android.support.constraint.a.a.f r5 = r5.mo1124g()
            if (r5 == 0) goto L_0x0175
            r5 = 1
            goto L_0x0176
        L_0x0175:
            r5 = 0
        L_0x0176:
            if (r11 != 0) goto L_0x0188
            if (r13 != 0) goto L_0x0188
            if (r10 == 0) goto L_0x0188
            if (r5 == 0) goto L_0x0188
            r5 = r25
            r20 = r2
            r3 = -1
            r10 = -2
            r18 = 1
            goto L_0x02d8
        L_0x0188:
            r20 = r2
            android.support.constraint.a.a.i r2 = r0.f756d
            android.support.constraint.a.a.h$a r2 = r2.mo1180j()
            r21 = r6
            android.support.constraint.a.a.h$a r6 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r2 == r6) goto L_0x0198
            r6 = 1
            goto L_0x0199
        L_0x0198:
            r6 = 0
        L_0x0199:
            android.support.constraint.a.a.i r2 = r0.f756d
            android.support.constraint.a.a.h$a r2 = r2.mo1194q()
            android.support.constraint.a.a.h$a r0 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r2 == r0) goto L_0x01a5
            r0 = 1
            goto L_0x01a6
        L_0x01a5:
            r0 = 0
        L_0x01a6:
            if (r6 != 0) goto L_0x01af
            android.support.constraint.a.a.q r2 = r7.mo1186m()
            r2.mo1252b()
        L_0x01af:
            if (r0 != 0) goto L_0x01b8
            android.support.constraint.a.a.q r2 = r7.mo1184l()
            r2.mo1252b()
        L_0x01b8:
            if (r11 != 0) goto L_0x01f0
            if (r6 == 0) goto L_0x01e7
            boolean r2 = r7.mo1131C()
            if (r2 == 0) goto L_0x01e7
            if (r10 == 0) goto L_0x01e7
            boolean r2 = r14.mo1253c()
            if (r2 == 0) goto L_0x01e7
            boolean r2 = r15.mo1253c()
            if (r2 == 0) goto L_0x01e7
            float r2 = r15.mo1245f()
            float r10 = r14.mo1245f()
            float r2 = r2 - r10
            int r11 = (int) r2
            android.support.constraint.a.a.q r2 = r7.mo1186m()
            r2.mo1248a(r11)
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            r14 = r2
            goto L_0x01f8
        L_0x01e7:
            r2 = -2
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r2)
            r14 = r6
            r2 = 1
            r6 = 0
            goto L_0x0204
        L_0x01f0:
            r2 = -2
            r10 = -1
            if (r11 != r10) goto L_0x01fa
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r10)
        L_0x01f8:
            r2 = 0
            goto L_0x0204
        L_0x01fa:
            if (r11 != r2) goto L_0x01fe
            r2 = 1
            goto L_0x01ff
        L_0x01fe:
            r2 = 0
        L_0x01ff:
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r1, r4, r11)
            r14 = r10
        L_0x0204:
            if (r13 != 0) goto L_0x0240
            if (r0 == 0) goto L_0x0236
            boolean r10 = r7.mo1130B()
            if (r10 == 0) goto L_0x0236
            if (r5 == 0) goto L_0x0236
            boolean r5 = r8.mo1253c()
            if (r5 == 0) goto L_0x0236
            boolean r5 = r9.mo1253c()
            if (r5 == 0) goto L_0x0236
            float r5 = r9.mo1245f()
            float r8 = r8.mo1245f()
            float r5 = r5 - r8
            int r13 = (int) r5
            android.support.constraint.a.a.q r5 = r7.mo1184l()
            r5.mo1248a(r13)
            r5 = r25
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            r9 = r0
            r0 = r8
            goto L_0x024c
        L_0x0236:
            r5 = r25
            r8 = -2
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r8)
            r8 = 1
            r9 = 0
            goto L_0x025c
        L_0x0240:
            r5 = r25
            r8 = -2
            r9 = -1
            if (r13 != r9) goto L_0x024e
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r9)
            r9 = r0
            r0 = r10
        L_0x024c:
            r8 = 0
            goto L_0x025c
        L_0x024e:
            if (r13 != r8) goto L_0x0252
            r8 = 1
            goto L_0x0253
        L_0x0252:
            r8 = 0
        L_0x0253:
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r13)
            r22 = r9
            r9 = r0
            r0 = r22
        L_0x025c:
            r3.measure(r14, r0)
            r0 = r23
            android.support.constraint.a.f r10 = r0.f772t
            if (r10 == 0) goto L_0x026e
            long r14 = r10.f1081a
            r18 = 1
            long r14 = r14 + r18
            r10.f1081a = r14
            goto L_0x0270
        L_0x026e:
            r18 = 1
        L_0x0270:
            r10 = -2
            if (r11 != r10) goto L_0x0275
            r11 = 1
            goto L_0x0276
        L_0x0275:
            r11 = 0
        L_0x0276:
            r7.mo1159b(r11)
            if (r13 != r10) goto L_0x027d
            r11 = 1
            goto L_0x027e
        L_0x027d:
            r11 = 0
        L_0x027e:
            r7.mo1149a(r11)
            int r11 = r3.getMeasuredWidth()
            int r13 = r3.getMeasuredHeight()
            r7.mo1191o(r11)
            r7.mo1175g(r13)
            if (r2 == 0) goto L_0x0294
            r7.mo1195q(r11)
        L_0x0294:
            if (r8 == 0) goto L_0x0299
            r7.mo1193p(r13)
        L_0x0299:
            if (r6 == 0) goto L_0x02a3
            android.support.constraint.a.a.q r2 = r7.mo1186m()
            r2.mo1248a(r11)
            goto L_0x02aa
        L_0x02a3:
            android.support.constraint.a.a.q r2 = r7.mo1186m()
            r2.mo1249f()
        L_0x02aa:
            if (r9 == 0) goto L_0x02b4
            android.support.constraint.a.a.q r2 = r7.mo1184l()
            r2.mo1248a(r13)
            goto L_0x02bb
        L_0x02b4:
            android.support.constraint.a.a.q r2 = r7.mo1184l()
            r2.mo1249f()
        L_0x02bb:
            r6 = r21
            boolean r2 = r6.f796X
            if (r2 == 0) goto L_0x02cc
            int r2 = r3.getBaseline()
            r3 = -1
            if (r2 == r3) goto L_0x02d8
            r7.mo1173f(r2)
            goto L_0x02d8
        L_0x02cc:
            r3 = -1
            goto L_0x02d8
        L_0x02ce:
            r20 = r2
            r17 = r5
            r18 = r8
            r3 = -1
            r10 = -2
            r5 = r25
        L_0x02d8:
            int r2 = r20 + 1
            r5 = r17
            r8 = r18
            r10 = 8
            goto L_0x00e5
        L_0x02e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m1021b(int, int):void");
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1018a(attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d6, code lost:
        if (r11 != -1) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1016a() {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r26.isInEditMode()
            int r2 = r26.getChildCount()
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L_0x0048
            r5 = 0
        L_0x000f:
            if (r5 >= r2) goto L_0x0048
            android.view.View r6 = r0.getChildAt(r5)
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0045 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            r0.mo1058a(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0045 }
            r8 = 47
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0045 }
            if (r8 == r4) goto L_0x003a
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x003a:
            int r6 = r6.getId()     // Catch:{ NotFoundException -> 0x0045 }
            android.support.constraint.a.a.h r6 = r0.mo12381b(r6)     // Catch:{ NotFoundException -> 0x0045 }
            r6.mo1148a(r7)     // Catch:{ NotFoundException -> 0x0045 }
        L_0x0045:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 >= r2) goto L_0x005c
            android.view.View r6 = r0.getChildAt(r5)
            android.support.constraint.a.a.h r6 = r0.mo1055a(r6)
            if (r6 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            r6.mo1132D()
        L_0x0059:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x005c:
            int r5 = r0.f764l
            if (r5 == r4) goto L_0x007e
            r5 = 0
        L_0x0061:
            if (r5 >= r2) goto L_0x007e
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getId()
            int r8 = r0.f764l
            if (r7 != r8) goto L_0x007b
            boolean r7 = r6 instanceof android.support.constraint.C0364e
            if (r7 == 0) goto L_0x007b
            android.support.constraint.e r6 = (android.support.constraint.C0364e) r6
            android.support.constraint.d r6 = r6.getConstraintSet()
            r0.f763k = r6
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x0061
        L_0x007e:
            android.support.constraint.d r5 = r0.f763k
            if (r5 == 0) goto L_0x0085
            r5.mo1328a(r0)
        L_0x0085:
            android.support.constraint.a.a.i r5 = r0.f756d
            r5.mo1258L()
            java.util.ArrayList<android.support.constraint.b> r5 = r0.f754b
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00a3
            r6 = 0
        L_0x0093:
            if (r6 >= r5) goto L_0x00a3
            java.util.ArrayList<android.support.constraint.b> r7 = r0.f754b
            java.lang.Object r7 = r7.get(r6)
            android.support.constraint.b r7 = (android.support.constraint.C0360b) r7
            r7.mo1321c(r0)
            int r6 = r6 + 1
            goto L_0x0093
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 >= r2) goto L_0x00b6
            android.view.View r6 = r0.getChildAt(r5)
            boolean r7 = r6 instanceof android.support.constraint.C0367g
            if (r7 == 0) goto L_0x00b3
            android.support.constraint.g r6 = (android.support.constraint.C0367g) r6
            r6.mo1344b(r0)
        L_0x00b3:
            int r5 = r5 + 1
            goto L_0x00a4
        L_0x00b6:
            r5 = 0
        L_0x00b7:
            if (r5 >= r2) goto L_0x03e5
            android.view.View r6 = r0.getChildAt(r5)
            android.support.constraint.a.a.h r13 = r0.mo1055a(r6)
            if (r13 != 0) goto L_0x00c5
            goto L_0x03e1
        L_0x00c5:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r14 = r7
            android.support.constraint.ConstraintLayout$a r14 = (android.support.constraint.ConstraintLayout.C0321a) r14
            r14.mo1085a()
            boolean r7 = r14.f824ma
            if (r7 == 0) goto L_0x00d6
            r14.f824ma = r3
            goto L_0x0108
        L_0x00d6:
            if (r1 == 0) goto L_0x0108
            android.content.res.Resources r7 = r26.getResources()     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r7 = r7.getResourceName(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r0.mo1058a(r3, r7, r8)     // Catch:{ NotFoundException -> 0x0107 }
            java.lang.String r8 = "id/"
            int r8 = r7.indexOf(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r8 + 3
            java.lang.String r7 = r7.substring(r8)     // Catch:{ NotFoundException -> 0x0107 }
            int r8 = r6.getId()     // Catch:{ NotFoundException -> 0x0107 }
            android.support.constraint.a.a.h r8 = r0.mo12381b(r8)     // Catch:{ NotFoundException -> 0x0107 }
            r8.mo1148a(r7)     // Catch:{ NotFoundException -> 0x0107 }
            goto L_0x0108
        L_0x0107:
        L_0x0108:
            int r7 = r6.getVisibility()
            r13.mo1189n(r7)
            boolean r7 = r14.f800aa
            if (r7 == 0) goto L_0x0118
            r7 = 8
            r13.mo1189n(r7)
        L_0x0118:
            r13.mo1147a(r6)
            android.support.constraint.a.a.i r6 = r0.f756d
            r6.mo1259b(r13)
            boolean r6 = r14.f795W
            if (r6 == 0) goto L_0x0128
            boolean r6 = r14.f794V
            if (r6 != 0) goto L_0x012d
        L_0x0128:
            java.util.ArrayList<android.support.constraint.a.a.h> r6 = r0.f755c
            r6.add(r13)
        L_0x012d:
            boolean r6 = r14.f797Y
            r7 = 17
            if (r6 == 0) goto L_0x015e
            android.support.constraint.a.a.l r13 = (android.support.constraint.p042a.p043a.C0340l) r13
            int r6 = r14.f816ia
            int r8 = r14.f818ja
            float r9 = r14.f820ka
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 >= r7) goto L_0x0145
            int r6 = r14.f799a
            int r8 = r14.f801b
            float r9 = r14.f803c
        L_0x0145:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0150
            r13.mo1230e(r9)
            goto L_0x03e1
        L_0x0150:
            if (r6 == r4) goto L_0x0157
            r13.mo1112t(r6)
            goto L_0x03e1
        L_0x0157:
            if (r8 == r4) goto L_0x03e1
            r13.mo1231u(r8)
            goto L_0x03e1
        L_0x015e:
            int r6 = r14.f805d
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f807e
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f809f
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f811g
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f828q
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f827p
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f829r
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f830s
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f813h
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f815i
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f817j
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f819k
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f821l
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f789Q
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f790R
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.f823m
            if (r6 != r4) goto L_0x01a6
            int r6 = r14.width
            if (r6 == r4) goto L_0x01a6
            int r6 = r14.height
            if (r6 != r4) goto L_0x03e1
        L_0x01a6:
            int r6 = r14.f802ba
            int r8 = r14.f804ca
            int r9 = r14.f806da
            int r10 = r14.f808ea
            int r11 = r14.f810fa
            int r12 = r14.f812ga
            float r15 = r14.f814ha
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r7) goto L_0x01f7
            int r3 = r14.f805d
            int r6 = r14.f807e
            int r9 = r14.f809f
            int r10 = r14.f811g
            int r7 = r14.f831t
            int r8 = r14.f833v
            float r15 = r14.f837z
            if (r3 != r4) goto L_0x01d9
            if (r6 != r4) goto L_0x01d9
            int r11 = r14.f828q
            if (r11 == r4) goto L_0x01d4
            r25 = r11
            r11 = r6
            r6 = r25
            goto L_0x01db
        L_0x01d4:
            int r11 = r14.f827p
            if (r11 == r4) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r11 = r6
        L_0x01da:
            r6 = r3
        L_0x01db:
            if (r9 != r4) goto L_0x01f2
            if (r10 != r4) goto L_0x01f2
            int r3 = r14.f829r
            if (r3 == r4) goto L_0x01e7
            r12 = r7
            r16 = r8
            goto L_0x01fc
        L_0x01e7:
            int r3 = r14.f830s
            if (r3 == r4) goto L_0x01f2
            r12 = r7
            r16 = r8
            r10 = r15
            r15 = r3
            r3 = r9
            goto L_0x0201
        L_0x01f2:
            r12 = r7
            r16 = r8
            r3 = r9
            goto L_0x01fc
        L_0x01f7:
            r3 = r9
            r16 = r12
            r12 = r11
            r11 = r8
        L_0x01fc:
            r25 = r15
            r15 = r10
            r10 = r25
        L_0x0201:
            int r7 = r14.f823m
            if (r7 == r4) goto L_0x0214
            android.support.constraint.a.a.h r3 = r0.mo12381b(r7)
            if (r3 == 0) goto L_0x0331
            float r6 = r14.f826o
            int r7 = r14.f825n
            r13.mo1145a(r3, r6, r7)
            goto L_0x0331
        L_0x0214:
            if (r6 == r4) goto L_0x022c
            android.support.constraint.a.a.h r9 = r0.mo12381b(r6)
            if (r9 == 0) goto L_0x0229
            android.support.constraint.a.a.f$c r6 = android.support.constraint.p042a.p043a.C0330f.C0333c.LEFT
            int r11 = r14.leftMargin
            r7 = r13
            r8 = r6
            r17 = r10
            r10 = r6
            r7.mo1142a(r8, r9, r10, r11, r12)
            goto L_0x0240
        L_0x0229:
            r17 = r10
            goto L_0x0240
        L_0x022c:
            r17 = r10
            if (r11 == r4) goto L_0x0240
            android.support.constraint.a.a.h r9 = r0.mo12381b(r11)
            if (r9 == 0) goto L_0x0240
            android.support.constraint.a.a.f$c r8 = android.support.constraint.p042a.p043a.C0330f.C0333c.LEFT
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.RIGHT
            int r11 = r14.leftMargin
            r7 = r13
            r7.mo1142a(r8, r9, r10, r11, r12)
        L_0x0240:
            if (r3 == r4) goto L_0x0255
            android.support.constraint.a.a.h r9 = r0.mo12381b(r3)
            if (r9 == 0) goto L_0x0268
            android.support.constraint.a.a.f$c r8 = android.support.constraint.p042a.p043a.C0330f.C0333c.RIGHT
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.LEFT
            int r11 = r14.rightMargin
            r7 = r13
            r12 = r16
            r7.mo1142a(r8, r9, r10, r11, r12)
            goto L_0x0268
        L_0x0255:
            if (r15 == r4) goto L_0x0268
            android.support.constraint.a.a.h r9 = r0.mo12381b(r15)
            if (r9 == 0) goto L_0x0268
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.RIGHT
            int r11 = r14.rightMargin
            r7 = r13
            r8 = r10
            r12 = r16
            r7.mo1142a(r8, r9, r10, r11, r12)
        L_0x0268:
            int r3 = r14.f813h
            if (r3 == r4) goto L_0x027e
            android.support.constraint.a.a.h r9 = r0.mo12381b(r3)
            if (r9 == 0) goto L_0x0294
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            int r11 = r14.topMargin
            int r12 = r14.f832u
            r7 = r13
            r8 = r10
            r7.mo1142a(r8, r9, r10, r11, r12)
            goto L_0x0294
        L_0x027e:
            int r3 = r14.f815i
            if (r3 == r4) goto L_0x0294
            android.support.constraint.a.a.h r9 = r0.mo12381b(r3)
            if (r9 == 0) goto L_0x0294
            android.support.constraint.a.a.f$c r8 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            int r11 = r14.topMargin
            int r12 = r14.f832u
            r7 = r13
            r7.mo1142a(r8, r9, r10, r11, r12)
        L_0x0294:
            int r3 = r14.f817j
            if (r3 == r4) goto L_0x02ab
            android.support.constraint.a.a.h r9 = r0.mo12381b(r3)
            if (r9 == 0) goto L_0x02c0
            android.support.constraint.a.a.f$c r8 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            int r11 = r14.bottomMargin
            int r12 = r14.f834w
            r7 = r13
            r7.mo1142a(r8, r9, r10, r11, r12)
            goto L_0x02c0
        L_0x02ab:
            int r3 = r14.f819k
            if (r3 == r4) goto L_0x02c0
            android.support.constraint.a.a.h r9 = r0.mo12381b(r3)
            if (r9 == 0) goto L_0x02c0
            android.support.constraint.a.a.f$c r10 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            int r11 = r14.bottomMargin
            int r12 = r14.f834w
            r7 = r13
            r8 = r10
            r7.mo1142a(r8, r9, r10, r11, r12)
        L_0x02c0:
            int r3 = r14.f821l
            if (r3 == r4) goto L_0x0314
            android.util.SparseArray<android.view.View> r6 = r0.f753a
            java.lang.Object r3 = r6.get(r3)
            android.view.View r3 = (android.view.View) r3
            int r6 = r14.f821l
            android.support.constraint.a.a.h r6 = r0.mo12381b(r6)
            if (r6 == 0) goto L_0x0314
            if (r3 == 0) goto L_0x0314
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            boolean r7 = r7 instanceof android.support.constraint.ConstraintLayout.C0321a
            if (r7 == 0) goto L_0x0314
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.constraint.ConstraintLayout$a r3 = (android.support.constraint.ConstraintLayout.C0321a) r3
            r7 = 1
            r14.f796X = r7
            r3.f796X = r7
            android.support.constraint.a.a.f$c r3 = android.support.constraint.p042a.p043a.C0330f.C0333c.BASELINE
            android.support.constraint.a.a.f r18 = r13.mo1136a(r3)
            android.support.constraint.a.a.f$c r3 = android.support.constraint.p042a.p043a.C0330f.C0333c.BASELINE
            android.support.constraint.a.a.f r19 = r6.mo1136a(r3)
            r20 = 0
            r21 = -1
            android.support.constraint.a.a.f$b r22 = android.support.constraint.p042a.p043a.C0330f.C0332b.STRONG
            r23 = 0
            r24 = 1
            r18.mo1117a(r19, r20, r21, r22, r23, r24)
            android.support.constraint.a.a.f$c r3 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            android.support.constraint.a.a.f r3 = r13.mo1136a(r3)
            r3.mo1127j()
            android.support.constraint.a.a.f$c r3 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            android.support.constraint.a.a.f r3 = r13.mo1136a(r3)
            r3.mo1127j()
        L_0x0314:
            r3 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r15 = r17
            int r7 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x0324
            int r7 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0324
            r13.mo1137a(r15)
        L_0x0324:
            float r7 = r14.f773A
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0331
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0331
            r13.mo1162c(r7)
        L_0x0331:
            if (r1 == 0) goto L_0x0342
            int r3 = r14.f789Q
            if (r3 != r4) goto L_0x033b
            int r3 = r14.f790R
            if (r3 == r4) goto L_0x0342
        L_0x033b:
            int r3 = r14.f789Q
            int r6 = r14.f790R
            r13.mo1163c(r3, r6)
        L_0x0342:
            boolean r3 = r14.f794V
            if (r3 != 0) goto L_0x036e
            int r3 = r14.width
            if (r3 != r4) goto L_0x0364
            android.support.constraint.a.a.h$a r3 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_PARENT
            r13.mo1143a(r3)
            android.support.constraint.a.a.f$c r3 = android.support.constraint.p042a.p043a.C0330f.C0333c.LEFT
            android.support.constraint.a.a.f r3 = r13.mo1136a(r3)
            int r6 = r14.leftMargin
            r3.f878e = r6
            android.support.constraint.a.a.f$c r3 = android.support.constraint.p042a.p043a.C0330f.C0333c.RIGHT
            android.support.constraint.a.a.f r3 = r13.mo1136a(r3)
            int r6 = r14.rightMargin
            r3.f878e = r6
            goto L_0x0378
        L_0x0364:
            android.support.constraint.a.a.h$a r3 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            r13.mo1143a(r3)
            r3 = 0
            r13.mo1191o(r3)
            goto L_0x0378
        L_0x036e:
            android.support.constraint.a.a.h$a r3 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            r13.mo1143a(r3)
            int r3 = r14.width
            r13.mo1191o(r3)
        L_0x0378:
            boolean r3 = r14.f795W
            if (r3 != 0) goto L_0x03a5
            int r3 = r14.height
            if (r3 != r4) goto L_0x039b
            android.support.constraint.a.a.h$a r3 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_PARENT
            r13.mo1156b(r3)
            android.support.constraint.a.a.f$c r3 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            android.support.constraint.a.a.f r3 = r13.mo1136a(r3)
            int r6 = r14.topMargin
            r3.f878e = r6
            android.support.constraint.a.a.f$c r3 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            android.support.constraint.a.a.f r3 = r13.mo1136a(r3)
            int r6 = r14.bottomMargin
            r3.f878e = r6
            r3 = 0
            goto L_0x03b0
        L_0x039b:
            android.support.constraint.a.a.h$a r3 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            r13.mo1156b(r3)
            r3 = 0
            r13.mo1175g(r3)
            goto L_0x03b0
        L_0x03a5:
            r3 = 0
            android.support.constraint.a.a.h$a r6 = android.support.constraint.p042a.p043a.C0335h.C0336a.FIXED
            r13.mo1156b(r6)
            int r6 = r14.height
            r13.mo1175g(r6)
        L_0x03b0:
            java.lang.String r6 = r14.f774B
            if (r6 == 0) goto L_0x03b7
            r13.mo1158b(r6)
        L_0x03b7:
            float r6 = r14.f777E
            r13.mo1153b(r6)
            float r6 = r14.f778F
            r13.mo1167d(r6)
            int r6 = r14.f779G
            r13.mo1177h(r6)
            int r6 = r14.f780H
            r13.mo1187m(r6)
            int r6 = r14.f781I
            int r7 = r14.f783K
            int r8 = r14.f785M
            float r9 = r14.f787O
            r13.mo1140a(r6, r7, r8, r9)
            int r6 = r14.f782J
            int r7 = r14.f784L
            int r8 = r14.f786N
            float r9 = r14.f788P
            r13.mo1155b(r6, r7, r8, r9)
        L_0x03e1:
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x03e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m1016a():void");
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1018a(attributeSet);
    }

    /* renamed from: a */
    public final C0335h mo1055a(View view) {
        C0335h hVar;
        if (view == this) {
            return this.f756d;
        }
        if (view == null) {
            hVar = null;
        } else {
            hVar = ((C0321a) view.getLayoutParams()).f822la;
        }
        return hVar;
    }

    /* renamed from: a */
    private void m1017a(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0321a aVar = (C0321a) childAt.getLayoutParams();
                C0335h hVar = aVar.f822la;
                if (!aVar.f797Y && !aVar.f798Z) {
                    hVar.mo1189n(childAt.getVisibility());
                    int i8 = aVar.width;
                    int i9 = aVar.height;
                    boolean z3 = aVar.f794V;
                    if (z3 || aVar.f795W || (!z3 && aVar.f781I == 1) || aVar.width == -1 || (!aVar.f795W && (aVar.f782J == 1 || aVar.height == -1))) {
                        if (i8 == 0) {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, -2);
                            z2 = true;
                        } else if (i8 == -1) {
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = i8 == -2;
                            i3 = ViewGroup.getChildMeasureSpec(i5, paddingLeft, i8);
                        }
                        if (i9 == 0) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, -2);
                            z = true;
                        } else if (i9 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, -1);
                            z = false;
                        } else {
                            z = i9 == -2;
                            i4 = ViewGroup.getChildMeasureSpec(i6, paddingTop, i9);
                        }
                        childAt.measure(i3, i4);
                        C0355f fVar = this.f772t;
                        if (fVar != null) {
                            fVar.f1081a++;
                        }
                        hVar.mo1159b(i8 == -2);
                        hVar.mo1149a(i9 == -2);
                        i8 = childAt.getMeasuredWidth();
                        i9 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    hVar.mo1191o(i8);
                    hVar.mo1175g(i9);
                    if (z2) {
                        hVar.mo1195q(i8);
                    }
                    if (z) {
                        hVar.mo1193p(i9);
                    }
                    if (aVar.f796X) {
                        int baseline = childAt.getBaseline();
                        if (baseline != -1) {
                            hVar.mo1173f(baseline);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1059a(String str) {
        this.f756d.mo1208K();
        C0355f fVar = this.f772t;
        if (fVar != null) {
            fVar.f1083c++;
        }
    }

    /* renamed from: a */
    public View mo1056a(int i) {
        return (View) this.f753a.get(i);
    }
}
