package android.support.constraint.p042a;

import java.util.Arrays;
import p216me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: android.support.constraint.a.i */
/* compiled from: SolverVariable */
public class C0358i {

    /* renamed from: a */
    private static int f1109a = 1;

    /* renamed from: b */
    private String f1110b;

    /* renamed from: c */
    public int f1111c = -1;

    /* renamed from: d */
    int f1112d = -1;

    /* renamed from: e */
    public int f1113e = 0;

    /* renamed from: f */
    public float f1114f;

    /* renamed from: g */
    float[] f1115g = new float[7];

    /* renamed from: h */
    C0359a f1116h;

    /* renamed from: i */
    C0350b[] f1117i = new C0350b[8];

    /* renamed from: j */
    int f1118j = 0;

    /* renamed from: k */
    public int f1119k = 0;

    /* renamed from: android.support.constraint.a.i$a */
    /* compiled from: SolverVariable */
    public enum C0359a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0358i(C0359a aVar, String str) {
        this.f1116h = aVar;
    }

    /* renamed from: a */
    static void m1318a() {
        f1109a++;
    }

    /* renamed from: b */
    public final void mo1315b(C0350b bVar) {
        int i = this.f1118j;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1117i[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0350b[] bVarArr = this.f1117i;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f1118j--;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo1316c(C0350b bVar) {
        int i = this.f1118j;
        for (int i2 = 0; i2 < i; i2++) {
            C0350b[] bVarArr = this.f1117i;
            bVarArr[i2].f1057d.mo1097a(bVarArr[i2], bVar, false);
        }
        this.f1118j = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BuildConfig.FLAVOR);
        sb.append(this.f1110b);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo1312a(C0350b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f1118j;
            if (i >= i2) {
                C0350b[] bVarArr = this.f1117i;
                if (i2 >= bVarArr.length) {
                    this.f1117i = (C0350b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0350b[] bVarArr2 = this.f1117i;
                int i3 = this.f1118j;
                bVarArr2[i3] = bVar;
                this.f1118j = i3 + 1;
                return;
            } else if (this.f1117i[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo1314b() {
        this.f1110b = null;
        this.f1116h = C0359a.UNKNOWN;
        this.f1113e = 0;
        this.f1111c = -1;
        this.f1112d = -1;
        this.f1114f = 0.0f;
        this.f1118j = 0;
        this.f1119k = 0;
    }

    /* renamed from: a */
    public void mo1313a(C0359a aVar, String str) {
        this.f1116h = aVar;
    }
}
