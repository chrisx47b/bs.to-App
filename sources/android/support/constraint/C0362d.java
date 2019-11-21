package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.support.constraint.C0364e.C0365a;
import android.support.constraint.ConstraintLayout.C0321a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.constraint.d */
/* compiled from: ConstraintSet */
public class C0362d {

    /* renamed from: a */
    private static final int[] f1132a = {0, 4, 8};

    /* renamed from: b */
    private static SparseIntArray f1133b = new SparseIntArray();

    /* renamed from: c */
    private HashMap<Integer, C0363a> f1134c = new HashMap<>();

    /* renamed from: android.support.constraint.d$a */
    /* compiled from: ConstraintSet */
    private static class C0363a {

        /* renamed from: A */
        public int f1135A;

        /* renamed from: B */
        public int f1136B;

        /* renamed from: C */
        public int f1137C;

        /* renamed from: D */
        public int f1138D;

        /* renamed from: E */
        public int f1139E;

        /* renamed from: F */
        public int f1140F;

        /* renamed from: G */
        public int f1141G;

        /* renamed from: H */
        public int f1142H;

        /* renamed from: I */
        public int f1143I;

        /* renamed from: J */
        public int f1144J;

        /* renamed from: K */
        public int f1145K;

        /* renamed from: L */
        public int f1146L;

        /* renamed from: M */
        public int f1147M;

        /* renamed from: N */
        public int f1148N;

        /* renamed from: O */
        public int f1149O;

        /* renamed from: P */
        public int f1150P;

        /* renamed from: Q */
        public float f1151Q;

        /* renamed from: R */
        public float f1152R;

        /* renamed from: S */
        public int f1153S;

        /* renamed from: T */
        public int f1154T;

        /* renamed from: U */
        public float f1155U;

        /* renamed from: V */
        public boolean f1156V;

        /* renamed from: W */
        public float f1157W;

        /* renamed from: X */
        public float f1158X;

        /* renamed from: Y */
        public float f1159Y;

        /* renamed from: Z */
        public float f1160Z;

        /* renamed from: a */
        boolean f1161a;

        /* renamed from: aa */
        public float f1162aa;

        /* renamed from: b */
        public int f1163b;

        /* renamed from: ba */
        public float f1164ba;

        /* renamed from: c */
        public int f1165c;

        /* renamed from: ca */
        public float f1166ca;

        /* renamed from: d */
        int f1167d;

        /* renamed from: da */
        public float f1168da;

        /* renamed from: e */
        public int f1169e;

        /* renamed from: ea */
        public float f1170ea;

        /* renamed from: f */
        public int f1171f;

        /* renamed from: fa */
        public float f1172fa;

        /* renamed from: g */
        public float f1173g;

        /* renamed from: ga */
        public float f1174ga;

        /* renamed from: h */
        public int f1175h;

        /* renamed from: ha */
        public boolean f1176ha;

        /* renamed from: i */
        public int f1177i;

        /* renamed from: ia */
        public boolean f1178ia;

        /* renamed from: j */
        public int f1179j;

        /* renamed from: ja */
        public int f1180ja;

        /* renamed from: k */
        public int f1181k;

        /* renamed from: ka */
        public int f1182ka;

        /* renamed from: l */
        public int f1183l;

        /* renamed from: la */
        public int f1184la;

        /* renamed from: m */
        public int f1185m;

        /* renamed from: ma */
        public int f1186ma;

        /* renamed from: n */
        public int f1187n;

        /* renamed from: na */
        public int f1188na;

        /* renamed from: o */
        public int f1189o;

        /* renamed from: oa */
        public int f1190oa;

        /* renamed from: p */
        public int f1191p;

        /* renamed from: pa */
        public float f1192pa;

        /* renamed from: q */
        public int f1193q;

        /* renamed from: qa */
        public float f1194qa;

        /* renamed from: r */
        public int f1195r;

        /* renamed from: ra */
        public boolean f1196ra;

        /* renamed from: s */
        public int f1197s;

        /* renamed from: sa */
        public int f1198sa;

        /* renamed from: t */
        public int f1199t;

        /* renamed from: ta */
        public int f1200ta;

        /* renamed from: u */
        public float f1201u;

        /* renamed from: ua */
        public int[] f1202ua;

        /* renamed from: v */
        public float f1203v;

        /* renamed from: va */
        public String f1204va;

        /* renamed from: w */
        public String f1205w;

        /* renamed from: x */
        public int f1206x;

        /* renamed from: y */
        public int f1207y;

        /* renamed from: z */
        public float f1208z;

        private C0363a() {
            this.f1161a = false;
            this.f1169e = -1;
            this.f1171f = -1;
            this.f1173g = -1.0f;
            this.f1175h = -1;
            this.f1177i = -1;
            this.f1179j = -1;
            this.f1181k = -1;
            this.f1183l = -1;
            this.f1185m = -1;
            this.f1187n = -1;
            this.f1189o = -1;
            this.f1191p = -1;
            this.f1193q = -1;
            this.f1195r = -1;
            this.f1197s = -1;
            this.f1199t = -1;
            this.f1201u = 0.5f;
            this.f1203v = 0.5f;
            this.f1205w = null;
            this.f1206x = -1;
            this.f1207y = 0;
            this.f1208z = 0.0f;
            this.f1135A = -1;
            this.f1136B = -1;
            this.f1137C = -1;
            this.f1138D = -1;
            this.f1139E = -1;
            this.f1140F = -1;
            this.f1141G = -1;
            this.f1142H = -1;
            this.f1143I = -1;
            this.f1144J = 0;
            this.f1145K = -1;
            this.f1146L = -1;
            this.f1147M = -1;
            this.f1148N = -1;
            this.f1149O = -1;
            this.f1150P = -1;
            this.f1151Q = 0.0f;
            this.f1152R = 0.0f;
            this.f1153S = 0;
            this.f1154T = 0;
            this.f1155U = 1.0f;
            this.f1156V = false;
            this.f1157W = 0.0f;
            this.f1158X = 0.0f;
            this.f1159Y = 0.0f;
            this.f1160Z = 0.0f;
            this.f1162aa = 1.0f;
            this.f1164ba = 1.0f;
            this.f1166ca = Float.NaN;
            this.f1168da = Float.NaN;
            this.f1170ea = 0.0f;
            this.f1172fa = 0.0f;
            this.f1174ga = 0.0f;
            this.f1176ha = false;
            this.f1178ia = false;
            this.f1180ja = 0;
            this.f1182ka = 0;
            this.f1184la = -1;
            this.f1186ma = -1;
            this.f1188na = -1;
            this.f1190oa = -1;
            this.f1192pa = 1.0f;
            this.f1194qa = 1.0f;
            this.f1196ra = false;
            this.f1198sa = -1;
            this.f1200ta = -1;
        }

        public C0363a clone() {
            C0363a aVar = new C0363a();
            aVar.f1161a = this.f1161a;
            aVar.f1163b = this.f1163b;
            aVar.f1165c = this.f1165c;
            aVar.f1169e = this.f1169e;
            aVar.f1171f = this.f1171f;
            aVar.f1173g = this.f1173g;
            aVar.f1175h = this.f1175h;
            aVar.f1177i = this.f1177i;
            aVar.f1179j = this.f1179j;
            aVar.f1181k = this.f1181k;
            aVar.f1183l = this.f1183l;
            aVar.f1185m = this.f1185m;
            aVar.f1187n = this.f1187n;
            aVar.f1189o = this.f1189o;
            aVar.f1191p = this.f1191p;
            aVar.f1193q = this.f1193q;
            aVar.f1195r = this.f1195r;
            aVar.f1197s = this.f1197s;
            aVar.f1199t = this.f1199t;
            aVar.f1201u = this.f1201u;
            aVar.f1203v = this.f1203v;
            aVar.f1205w = this.f1205w;
            aVar.f1135A = this.f1135A;
            aVar.f1136B = this.f1136B;
            aVar.f1201u = this.f1201u;
            aVar.f1201u = this.f1201u;
            aVar.f1201u = this.f1201u;
            aVar.f1201u = this.f1201u;
            aVar.f1201u = this.f1201u;
            aVar.f1137C = this.f1137C;
            aVar.f1138D = this.f1138D;
            aVar.f1139E = this.f1139E;
            aVar.f1140F = this.f1140F;
            aVar.f1141G = this.f1141G;
            aVar.f1142H = this.f1142H;
            aVar.f1143I = this.f1143I;
            aVar.f1144J = this.f1144J;
            aVar.f1145K = this.f1145K;
            aVar.f1146L = this.f1146L;
            aVar.f1147M = this.f1147M;
            aVar.f1148N = this.f1148N;
            aVar.f1149O = this.f1149O;
            aVar.f1150P = this.f1150P;
            aVar.f1151Q = this.f1151Q;
            aVar.f1152R = this.f1152R;
            aVar.f1153S = this.f1153S;
            aVar.f1154T = this.f1154T;
            aVar.f1155U = this.f1155U;
            aVar.f1156V = this.f1156V;
            aVar.f1157W = this.f1157W;
            aVar.f1158X = this.f1158X;
            aVar.f1159Y = this.f1159Y;
            aVar.f1160Z = this.f1160Z;
            aVar.f1162aa = this.f1162aa;
            aVar.f1164ba = this.f1164ba;
            aVar.f1166ca = this.f1166ca;
            aVar.f1168da = this.f1168da;
            aVar.f1170ea = this.f1170ea;
            aVar.f1172fa = this.f1172fa;
            aVar.f1174ga = this.f1174ga;
            aVar.f1176ha = this.f1176ha;
            aVar.f1178ia = this.f1178ia;
            aVar.f1180ja = this.f1180ja;
            aVar.f1182ka = this.f1182ka;
            aVar.f1184la = this.f1184la;
            aVar.f1186ma = this.f1186ma;
            aVar.f1188na = this.f1188na;
            aVar.f1190oa = this.f1190oa;
            aVar.f1192pa = this.f1192pa;
            aVar.f1194qa = this.f1194qa;
            aVar.f1198sa = this.f1198sa;
            aVar.f1200ta = this.f1200ta;
            int[] iArr = this.f1202ua;
            if (iArr != null) {
                aVar.f1202ua = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.f1206x = this.f1206x;
            aVar.f1207y = this.f1207y;
            aVar.f1208z = this.f1208z;
            aVar.f1196ra = this.f1196ra;
            return aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1339a(C0360b bVar, int i, C0365a aVar) {
            m1338a(i, aVar);
            if (bVar instanceof C0323a) {
                this.f1200ta = 1;
                C0323a aVar2 = (C0323a) bVar;
                this.f1198sa = aVar2.getType();
                this.f1202ua = aVar2.getReferencedIds();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1338a(int i, C0365a aVar) {
            m1337a(i, (C0321a) aVar);
            this.f1155U = aVar.f1210na;
            this.f1158X = aVar.f1213qa;
            this.f1159Y = aVar.f1214ra;
            this.f1160Z = aVar.f1215sa;
            this.f1162aa = aVar.f1216ta;
            this.f1164ba = aVar.f1217ua;
            this.f1166ca = aVar.f1218va;
            this.f1168da = aVar.f1219wa;
            this.f1170ea = aVar.f1220xa;
            this.f1172fa = aVar.f1221ya;
            this.f1174ga = aVar.f1222za;
            this.f1157W = aVar.f1212pa;
            this.f1156V = aVar.f1211oa;
        }

        /* renamed from: a */
        private void m1337a(int i, C0321a aVar) {
            this.f1167d = i;
            this.f1175h = aVar.f805d;
            this.f1177i = aVar.f807e;
            this.f1179j = aVar.f809f;
            this.f1181k = aVar.f811g;
            this.f1183l = aVar.f813h;
            this.f1185m = aVar.f815i;
            this.f1187n = aVar.f817j;
            this.f1189o = aVar.f819k;
            this.f1191p = aVar.f821l;
            this.f1193q = aVar.f827p;
            this.f1195r = aVar.f828q;
            this.f1197s = aVar.f829r;
            this.f1199t = aVar.f830s;
            this.f1201u = aVar.f837z;
            this.f1203v = aVar.f773A;
            this.f1205w = aVar.f774B;
            this.f1206x = aVar.f823m;
            this.f1207y = aVar.f825n;
            this.f1208z = aVar.f826o;
            this.f1135A = aVar.f789Q;
            this.f1136B = aVar.f790R;
            this.f1137C = aVar.f791S;
            this.f1173g = aVar.f803c;
            this.f1169e = aVar.f799a;
            this.f1171f = aVar.f801b;
            this.f1163b = aVar.width;
            this.f1165c = aVar.height;
            this.f1138D = aVar.leftMargin;
            this.f1139E = aVar.rightMargin;
            this.f1140F = aVar.topMargin;
            this.f1141G = aVar.bottomMargin;
            this.f1151Q = aVar.f778F;
            this.f1152R = aVar.f777E;
            this.f1154T = aVar.f780H;
            this.f1153S = aVar.f779G;
            boolean z = aVar.f792T;
            this.f1176ha = z;
            this.f1178ia = aVar.f793U;
            this.f1180ja = aVar.f781I;
            this.f1182ka = aVar.f782J;
            this.f1176ha = z;
            this.f1184la = aVar.f785M;
            this.f1186ma = aVar.f786N;
            this.f1188na = aVar.f783K;
            this.f1190oa = aVar.f784L;
            this.f1192pa = aVar.f787O;
            this.f1194qa = aVar.f788P;
            if (VERSION.SDK_INT >= 17) {
                this.f1142H = aVar.getMarginEnd();
                this.f1143I = aVar.getMarginStart();
            }
        }

        /* renamed from: a */
        public void mo1330a(C0321a aVar) {
            aVar.f805d = this.f1175h;
            aVar.f807e = this.f1177i;
            aVar.f809f = this.f1179j;
            aVar.f811g = this.f1181k;
            aVar.f813h = this.f1183l;
            aVar.f815i = this.f1185m;
            aVar.f817j = this.f1187n;
            aVar.f819k = this.f1189o;
            aVar.f821l = this.f1191p;
            aVar.f827p = this.f1193q;
            aVar.f828q = this.f1195r;
            aVar.f829r = this.f1197s;
            aVar.f830s = this.f1199t;
            aVar.leftMargin = this.f1138D;
            aVar.rightMargin = this.f1139E;
            aVar.topMargin = this.f1140F;
            aVar.bottomMargin = this.f1141G;
            aVar.f835x = this.f1150P;
            aVar.f836y = this.f1149O;
            aVar.f837z = this.f1201u;
            aVar.f773A = this.f1203v;
            aVar.f823m = this.f1206x;
            aVar.f825n = this.f1207y;
            aVar.f826o = this.f1208z;
            aVar.f774B = this.f1205w;
            aVar.f789Q = this.f1135A;
            aVar.f790R = this.f1136B;
            aVar.f778F = this.f1151Q;
            aVar.f777E = this.f1152R;
            aVar.f780H = this.f1154T;
            aVar.f779G = this.f1153S;
            aVar.f792T = this.f1176ha;
            aVar.f793U = this.f1178ia;
            aVar.f781I = this.f1180ja;
            aVar.f782J = this.f1182ka;
            aVar.f785M = this.f1184la;
            aVar.f786N = this.f1186ma;
            aVar.f783K = this.f1188na;
            aVar.f784L = this.f1190oa;
            aVar.f787O = this.f1192pa;
            aVar.f788P = this.f1194qa;
            aVar.f791S = this.f1137C;
            aVar.f803c = this.f1173g;
            aVar.f799a = this.f1169e;
            aVar.f801b = this.f1171f;
            aVar.width = this.f1163b;
            aVar.height = this.f1165c;
            if (VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.f1143I);
                aVar.setMarginEnd(this.f1142H);
            }
            aVar.mo1085a();
        }
    }

    static {
        f1133b.append(C0369i.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f1133b.append(C0369i.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f1133b.append(C0369i.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f1133b.append(C0369i.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f1133b.append(C0369i.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f1133b.append(C0369i.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f1133b.append(C0369i.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f1133b.append(C0369i.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f1133b.append(C0369i.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f1133b.append(C0369i.ConstraintSet_layout_editor_absoluteX, 6);
        f1133b.append(C0369i.ConstraintSet_layout_editor_absoluteY, 7);
        f1133b.append(C0369i.ConstraintSet_layout_constraintGuide_begin, 17);
        f1133b.append(C0369i.ConstraintSet_layout_constraintGuide_end, 18);
        f1133b.append(C0369i.ConstraintSet_layout_constraintGuide_percent, 19);
        f1133b.append(C0369i.ConstraintSet_android_orientation, 27);
        f1133b.append(C0369i.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f1133b.append(C0369i.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f1133b.append(C0369i.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f1133b.append(C0369i.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f1133b.append(C0369i.ConstraintSet_layout_goneMarginLeft, 13);
        f1133b.append(C0369i.ConstraintSet_layout_goneMarginTop, 16);
        f1133b.append(C0369i.ConstraintSet_layout_goneMarginRight, 14);
        f1133b.append(C0369i.ConstraintSet_layout_goneMarginBottom, 11);
        f1133b.append(C0369i.ConstraintSet_layout_goneMarginStart, 15);
        f1133b.append(C0369i.ConstraintSet_layout_goneMarginEnd, 12);
        f1133b.append(C0369i.ConstraintSet_layout_constraintVertical_weight, 40);
        f1133b.append(C0369i.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f1133b.append(C0369i.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f1133b.append(C0369i.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f1133b.append(C0369i.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f1133b.append(C0369i.ConstraintSet_layout_constraintVertical_bias, 37);
        f1133b.append(C0369i.ConstraintSet_layout_constraintDimensionRatio, 5);
        f1133b.append(C0369i.ConstraintSet_layout_constraintLeft_creator, 75);
        f1133b.append(C0369i.ConstraintSet_layout_constraintTop_creator, 75);
        f1133b.append(C0369i.ConstraintSet_layout_constraintRight_creator, 75);
        f1133b.append(C0369i.ConstraintSet_layout_constraintBottom_creator, 75);
        f1133b.append(C0369i.ConstraintSet_layout_constraintBaseline_creator, 75);
        f1133b.append(C0369i.ConstraintSet_android_layout_marginLeft, 24);
        f1133b.append(C0369i.ConstraintSet_android_layout_marginRight, 28);
        f1133b.append(C0369i.ConstraintSet_android_layout_marginStart, 31);
        f1133b.append(C0369i.ConstraintSet_android_layout_marginEnd, 8);
        f1133b.append(C0369i.ConstraintSet_android_layout_marginTop, 34);
        f1133b.append(C0369i.ConstraintSet_android_layout_marginBottom, 2);
        f1133b.append(C0369i.ConstraintSet_android_layout_width, 23);
        f1133b.append(C0369i.ConstraintSet_android_layout_height, 21);
        f1133b.append(C0369i.ConstraintSet_android_visibility, 22);
        f1133b.append(C0369i.ConstraintSet_android_alpha, 43);
        f1133b.append(C0369i.ConstraintSet_android_elevation, 44);
        f1133b.append(C0369i.ConstraintSet_android_rotationX, 45);
        f1133b.append(C0369i.ConstraintSet_android_rotationY, 46);
        f1133b.append(C0369i.ConstraintSet_android_rotation, 60);
        f1133b.append(C0369i.ConstraintSet_android_scaleX, 47);
        f1133b.append(C0369i.ConstraintSet_android_scaleY, 48);
        f1133b.append(C0369i.ConstraintSet_android_transformPivotX, 49);
        f1133b.append(C0369i.ConstraintSet_android_transformPivotY, 50);
        f1133b.append(C0369i.ConstraintSet_android_translationX, 51);
        f1133b.append(C0369i.ConstraintSet_android_translationY, 52);
        f1133b.append(C0369i.ConstraintSet_android_translationZ, 53);
        f1133b.append(C0369i.ConstraintSet_layout_constraintWidth_default, 54);
        f1133b.append(C0369i.ConstraintSet_layout_constraintHeight_default, 55);
        f1133b.append(C0369i.ConstraintSet_layout_constraintWidth_max, 56);
        f1133b.append(C0369i.ConstraintSet_layout_constraintHeight_max, 57);
        f1133b.append(C0369i.ConstraintSet_layout_constraintWidth_min, 58);
        f1133b.append(C0369i.ConstraintSet_layout_constraintHeight_min, 59);
        f1133b.append(C0369i.ConstraintSet_layout_constraintCircle, 61);
        f1133b.append(C0369i.ConstraintSet_layout_constraintCircleRadius, 62);
        f1133b.append(C0369i.ConstraintSet_layout_constraintCircleAngle, 63);
        f1133b.append(C0369i.ConstraintSet_android_id, 38);
        f1133b.append(C0369i.ConstraintSet_layout_constraintWidth_percent, 69);
        f1133b.append(C0369i.ConstraintSet_layout_constraintHeight_percent, 70);
        f1133b.append(C0369i.ConstraintSet_chainUseRtl, 71);
        f1133b.append(C0369i.ConstraintSet_barrierDirection, 72);
        f1133b.append(C0369i.ConstraintSet_constraint_referenced_ids, 73);
        f1133b.append(C0369i.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: a */
    public void mo1329a(C0364e eVar) {
        int childCount = eVar.getChildCount();
        this.f1134c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = eVar.getChildAt(i);
            C0365a aVar = (C0365a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f1134c.containsKey(Integer.valueOf(id))) {
                    this.f1134c.put(Integer.valueOf(id), new C0363a());
                }
                C0363a aVar2 = (C0363a) this.f1134c.get(Integer.valueOf(id));
                if (childAt instanceof C0360b) {
                    aVar2.m1339a((C0360b) childAt, id, aVar);
                }
                aVar2.m1338a(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1328a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1134c.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f1134c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0363a aVar = (C0363a) this.f1134c.get(Integer.valueOf(id));
                    if (childAt instanceof C0323a) {
                        aVar.f1200ta = 1;
                    }
                    int i2 = aVar.f1200ta;
                    if (i2 != -1 && i2 == 1) {
                        C0323a aVar2 = (C0323a) childAt;
                        aVar2.setId(id);
                        aVar2.setType(aVar.f1198sa);
                        aVar2.setAllowsGoneWidget(aVar.f1196ra);
                        int[] iArr = aVar.f1202ua;
                        if (iArr != null) {
                            aVar2.setReferencedIds(iArr);
                        } else {
                            String str = aVar.f1204va;
                            if (str != null) {
                                aVar.f1202ua = m1333a((View) aVar2, str);
                                aVar2.setReferencedIds(aVar.f1202ua);
                            }
                        }
                    }
                    C0321a aVar3 = (C0321a) childAt.getLayoutParams();
                    aVar.mo1330a(aVar3);
                    childAt.setLayoutParams(aVar3);
                    childAt.setVisibility(aVar.f1144J);
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.f1155U);
                        childAt.setRotation(aVar.f1158X);
                        childAt.setRotationX(aVar.f1159Y);
                        childAt.setRotationY(aVar.f1160Z);
                        childAt.setScaleX(aVar.f1162aa);
                        childAt.setScaleY(aVar.f1164ba);
                        if (!Float.isNaN(aVar.f1166ca)) {
                            childAt.setPivotX(aVar.f1166ca);
                        }
                        if (!Float.isNaN(aVar.f1168da)) {
                            childAt.setPivotY(aVar.f1168da);
                        }
                        childAt.setTranslationX(aVar.f1170ea);
                        childAt.setTranslationY(aVar.f1172fa);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.f1174ga);
                            if (aVar.f1156V) {
                                childAt.setElevation(aVar.f1157W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0363a aVar4 = (C0363a) this.f1134c.get(num);
            int i3 = aVar4.f1200ta;
            if (i3 != -1 && i3 == 1) {
                C0323a aVar5 = new C0323a(constraintLayout.getContext());
                aVar5.setId(num.intValue());
                int[] iArr2 = aVar4.f1202ua;
                if (iArr2 != null) {
                    aVar5.setReferencedIds(iArr2);
                } else {
                    String str2 = aVar4.f1204va;
                    if (str2 != null) {
                        aVar4.f1202ua = m1333a((View) aVar5, str2);
                        aVar5.setReferencedIds(aVar4.f1202ua);
                    }
                }
                aVar5.setType(aVar4.f1198sa);
                C0321a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar5.mo1318a();
                aVar4.mo1330a(generateDefaultLayoutParams);
                constraintLayout.addView(aVar5, generateDefaultLayoutParams);
            }
            if (aVar4.f1161a) {
                C0366f fVar = new C0366f(constraintLayout.getContext());
                fVar.setId(num.intValue());
                C0321a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar4.mo1330a(generateDefaultLayoutParams2);
                constraintLayout.addView(fVar, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: a */
    public void mo1327a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0363a a = m1331a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f1161a = true;
                    }
                    this.f1134c.put(Integer.valueOf(a.f1167d), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private static int m1330a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    private C0363a m1331a(Context context, AttributeSet attributeSet) {
        C0363a aVar = new C0363a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0369i.ConstraintSet);
        m1332a(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    private void m1332a(C0363a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f1133b.get(index);
            switch (i2) {
                case 1:
                    aVar.f1191p = m1330a(typedArray, index, aVar.f1191p);
                    break;
                case 2:
                    aVar.f1141G = typedArray.getDimensionPixelSize(index, aVar.f1141G);
                    break;
                case 3:
                    aVar.f1189o = m1330a(typedArray, index, aVar.f1189o);
                    break;
                case 4:
                    aVar.f1187n = m1330a(typedArray, index, aVar.f1187n);
                    break;
                case 5:
                    aVar.f1205w = typedArray.getString(index);
                    break;
                case 6:
                    aVar.f1135A = typedArray.getDimensionPixelOffset(index, aVar.f1135A);
                    break;
                case 7:
                    aVar.f1136B = typedArray.getDimensionPixelOffset(index, aVar.f1136B);
                    break;
                case 8:
                    aVar.f1142H = typedArray.getDimensionPixelSize(index, aVar.f1142H);
                    break;
                case 9:
                    aVar.f1199t = m1330a(typedArray, index, aVar.f1199t);
                    break;
                case 10:
                    aVar.f1197s = m1330a(typedArray, index, aVar.f1197s);
                    break;
                case 11:
                    aVar.f1148N = typedArray.getDimensionPixelSize(index, aVar.f1148N);
                    break;
                case 12:
                    aVar.f1149O = typedArray.getDimensionPixelSize(index, aVar.f1149O);
                    break;
                case 13:
                    aVar.f1145K = typedArray.getDimensionPixelSize(index, aVar.f1145K);
                    break;
                case 14:
                    aVar.f1147M = typedArray.getDimensionPixelSize(index, aVar.f1147M);
                    break;
                case 15:
                    aVar.f1150P = typedArray.getDimensionPixelSize(index, aVar.f1150P);
                    break;
                case 16:
                    aVar.f1146L = typedArray.getDimensionPixelSize(index, aVar.f1146L);
                    break;
                case 17:
                    aVar.f1169e = typedArray.getDimensionPixelOffset(index, aVar.f1169e);
                    break;
                case 18:
                    aVar.f1171f = typedArray.getDimensionPixelOffset(index, aVar.f1171f);
                    break;
                case 19:
                    aVar.f1173g = typedArray.getFloat(index, aVar.f1173g);
                    break;
                case 20:
                    aVar.f1201u = typedArray.getFloat(index, aVar.f1201u);
                    break;
                case 21:
                    aVar.f1165c = typedArray.getLayoutDimension(index, aVar.f1165c);
                    break;
                case 22:
                    aVar.f1144J = typedArray.getInt(index, aVar.f1144J);
                    aVar.f1144J = f1132a[aVar.f1144J];
                    break;
                case 23:
                    aVar.f1163b = typedArray.getLayoutDimension(index, aVar.f1163b);
                    break;
                case 24:
                    aVar.f1138D = typedArray.getDimensionPixelSize(index, aVar.f1138D);
                    break;
                case 25:
                    aVar.f1175h = m1330a(typedArray, index, aVar.f1175h);
                    break;
                case 26:
                    aVar.f1177i = m1330a(typedArray, index, aVar.f1177i);
                    break;
                case 27:
                    aVar.f1137C = typedArray.getInt(index, aVar.f1137C);
                    break;
                case 28:
                    aVar.f1139E = typedArray.getDimensionPixelSize(index, aVar.f1139E);
                    break;
                case 29:
                    aVar.f1179j = m1330a(typedArray, index, aVar.f1179j);
                    break;
                case 30:
                    aVar.f1181k = m1330a(typedArray, index, aVar.f1181k);
                    break;
                case 31:
                    aVar.f1143I = typedArray.getDimensionPixelSize(index, aVar.f1143I);
                    break;
                case 32:
                    aVar.f1193q = m1330a(typedArray, index, aVar.f1193q);
                    break;
                case 33:
                    aVar.f1195r = m1330a(typedArray, index, aVar.f1195r);
                    break;
                case 34:
                    aVar.f1140F = typedArray.getDimensionPixelSize(index, aVar.f1140F);
                    break;
                case 35:
                    aVar.f1185m = m1330a(typedArray, index, aVar.f1185m);
                    break;
                case 36:
                    aVar.f1183l = m1330a(typedArray, index, aVar.f1183l);
                    break;
                case 37:
                    aVar.f1203v = typedArray.getFloat(index, aVar.f1203v);
                    break;
                case 38:
                    aVar.f1167d = typedArray.getResourceId(index, aVar.f1167d);
                    break;
                case 39:
                    aVar.f1152R = typedArray.getFloat(index, aVar.f1152R);
                    break;
                case 40:
                    aVar.f1151Q = typedArray.getFloat(index, aVar.f1151Q);
                    break;
                case 41:
                    aVar.f1153S = typedArray.getInt(index, aVar.f1153S);
                    break;
                case 42:
                    aVar.f1154T = typedArray.getInt(index, aVar.f1154T);
                    break;
                case 43:
                    aVar.f1155U = typedArray.getFloat(index, aVar.f1155U);
                    break;
                case 44:
                    aVar.f1156V = true;
                    aVar.f1157W = typedArray.getDimension(index, aVar.f1157W);
                    break;
                case 45:
                    aVar.f1159Y = typedArray.getFloat(index, aVar.f1159Y);
                    break;
                case 46:
                    aVar.f1160Z = typedArray.getFloat(index, aVar.f1160Z);
                    break;
                case 47:
                    aVar.f1162aa = typedArray.getFloat(index, aVar.f1162aa);
                    break;
                case 48:
                    aVar.f1164ba = typedArray.getFloat(index, aVar.f1164ba);
                    break;
                case 49:
                    aVar.f1166ca = typedArray.getFloat(index, aVar.f1166ca);
                    break;
                case 50:
                    aVar.f1168da = typedArray.getFloat(index, aVar.f1168da);
                    break;
                case 51:
                    aVar.f1170ea = typedArray.getDimension(index, aVar.f1170ea);
                    break;
                case 52:
                    aVar.f1172fa = typedArray.getDimension(index, aVar.f1172fa);
                    break;
                case 53:
                    aVar.f1174ga = typedArray.getDimension(index, aVar.f1174ga);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.f1158X = typedArray.getFloat(index, aVar.f1158X);
                            break;
                        case 61:
                            aVar.f1206x = m1330a(typedArray, index, aVar.f1206x);
                            break;
                        case 62:
                            aVar.f1207y = typedArray.getDimensionPixelSize(index, aVar.f1207y);
                            break;
                        case 63:
                            aVar.f1208z = typedArray.getFloat(index, aVar.f1208z);
                            break;
                        default:
                            String str = "   ";
                            String str2 = "ConstraintSet";
                            switch (i2) {
                                case 69:
                                    aVar.f1192pa = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    aVar.f1194qa = typedArray.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e(str2, "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    aVar.f1198sa = typedArray.getInt(index, aVar.f1198sa);
                                    break;
                                case 73:
                                    aVar.f1204va = typedArray.getString(index);
                                    break;
                                case 74:
                                    aVar.f1196ra = typedArray.getBoolean(index, aVar.f1196ra);
                                    break;
                                case 75:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("unused attribute 0x");
                                    sb.append(Integer.toHexString(index));
                                    sb.append(str);
                                    sb.append(f1133b.get(index));
                                    Log.w(str2, sb.toString());
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Unknown attribute 0x");
                                    sb2.append(Integer.toHexString(index));
                                    sb2.append(str);
                                    sb2.append(f1133b.get(index));
                                    Log.w(str2, sb2.toString());
                                    break;
                            }
                    }
            }
        }
    }

    /* renamed from: a */
    private int[] m1333a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0368h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) view.getParent()).mo1057a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
