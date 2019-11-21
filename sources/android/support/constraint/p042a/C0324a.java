package android.support.constraint.p042a;

import android.support.constraint.p042a.C0358i.C0359a;
import java.util.Arrays;
import p216me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: android.support.constraint.a.a */
/* compiled from: ArrayLinkedVariables */
public class C0324a {

    /* renamed from: a */
    int f842a = 0;

    /* renamed from: b */
    private final C0350b f843b;

    /* renamed from: c */
    private final C0351c f844c;

    /* renamed from: d */
    private int f845d = 8;

    /* renamed from: e */
    private C0358i f846e = null;

    /* renamed from: f */
    private int[] f847f;

    /* renamed from: g */
    private int[] f848g;

    /* renamed from: h */
    private float[] f849h;

    /* renamed from: i */
    private int f850i;

    /* renamed from: j */
    private int f851j;

    /* renamed from: k */
    private boolean f852k;

    C0324a(C0350b bVar, C0351c cVar) {
        int i = this.f845d;
        this.f847f = new int[i];
        this.f848g = new int[i];
        this.f849h = new float[i];
        this.f850i = -1;
        this.f851j = -1;
        this.f852k = false;
        this.f843b = bVar;
        this.f844c = cVar;
    }

    /* renamed from: a */
    public final void mo1099a(C0358i iVar, float f) {
        if (f == 0.0f) {
            mo1091a(iVar, true);
            return;
        }
        int i = this.f850i;
        if (i == -1) {
            this.f850i = 0;
            float[] fArr = this.f849h;
            int i2 = this.f850i;
            fArr[i2] = f;
            this.f847f[i2] = iVar.f1111c;
            this.f848g[i2] = -1;
            iVar.f1119k++;
            iVar.mo1312a(this.f843b);
            this.f842a++;
            if (!this.f852k) {
                this.f851j++;
                int i3 = this.f851j;
                int[] iArr = this.f847f;
                if (i3 >= iArr.length) {
                    this.f852k = true;
                    this.f851j = iArr.length - 1;
                }
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.f842a) {
            int[] iArr2 = this.f847f;
            int i6 = iArr2[i];
            int i7 = iVar.f1111c;
            if (i6 == i7) {
                this.f849h[i] = f;
                return;
            }
            if (iArr2[i] < i7) {
                i5 = i;
            }
            i = this.f848g[i];
            i4++;
        }
        int i8 = this.f851j;
        int i9 = i8 + 1;
        if (this.f852k) {
            int[] iArr3 = this.f847f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f847f;
        if (i8 >= iArr4.length && this.f842a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f847f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f847f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            this.f845d *= 2;
            this.f852k = false;
            this.f851j = i8 - 1;
            this.f849h = Arrays.copyOf(this.f849h, this.f845d);
            this.f847f = Arrays.copyOf(this.f847f, this.f845d);
            this.f848g = Arrays.copyOf(this.f848g, this.f845d);
        }
        this.f847f[i8] = iVar.f1111c;
        this.f849h[i8] = f;
        if (i5 != -1) {
            int[] iArr7 = this.f848g;
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            this.f848g[i8] = this.f850i;
            this.f850i = i8;
        }
        iVar.f1119k++;
        iVar.mo1312a(this.f843b);
        this.f842a++;
        if (!this.f852k) {
            this.f851j++;
        }
        if (this.f842a >= this.f847f.length) {
            this.f852k = true;
        }
        int i11 = this.f851j;
        int[] iArr8 = this.f847f;
        if (i11 >= iArr8.length) {
            this.f852k = true;
            this.f851j = iArr8.length - 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1104b() {
        int i = this.f850i;
        int i2 = 0;
        while (i != -1 && i2 < this.f842a) {
            float[] fArr = this.f849h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f848g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f850i;
        String str = BuildConfig.FLAVOR;
        int i2 = 0;
        while (i != -1 && i2 < this.f842a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f849h[i]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f844c.f1061c[this.f847f[i]]);
            str = sb5.toString();
            i = this.f848g[i];
            i2++;
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo1102b(int i) {
        int i2 = this.f850i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f842a) {
            if (i3 == i) {
                return this.f849h[i2];
            }
            i2 = this.f848g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo1103b(C0358i iVar) {
        int i = this.f850i;
        int i2 = 0;
        while (i != -1 && i2 < this.f842a) {
            if (this.f847f[i] == iVar.f1111c) {
                return this.f849h[i];
            }
            i = this.f848g[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1100a(C0358i iVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f850i;
            if (i == -1) {
                this.f850i = 0;
                float[] fArr = this.f849h;
                int i2 = this.f850i;
                fArr[i2] = f;
                this.f847f[i2] = iVar.f1111c;
                this.f848g[i2] = -1;
                iVar.f1119k++;
                iVar.mo1312a(this.f843b);
                this.f842a++;
                if (!this.f852k) {
                    this.f851j++;
                    int i3 = this.f851j;
                    int[] iArr = this.f847f;
                    if (i3 >= iArr.length) {
                        this.f852k = true;
                        this.f851j = iArr.length - 1;
                    }
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i != -1 && i4 < this.f842a) {
                int[] iArr2 = this.f847f;
                int i6 = iArr2[i];
                int i7 = iVar.f1111c;
                if (i6 == i7) {
                    float[] fArr2 = this.f849h;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.f850i) {
                            this.f850i = this.f848g[i];
                        } else {
                            int[] iArr3 = this.f848g;
                            iArr3[i5] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo1315b(this.f843b);
                        }
                        if (this.f852k) {
                            this.f851j = i;
                        }
                        iVar.f1119k--;
                        this.f842a--;
                    }
                    return;
                }
                if (iArr2[i] < i7) {
                    i5 = i;
                }
                i = this.f848g[i];
                i4++;
            }
            int i8 = this.f851j;
            int i9 = i8 + 1;
            if (this.f852k) {
                int[] iArr4 = this.f847f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f847f;
            if (i8 >= iArr5.length && this.f842a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f847f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f847f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                this.f845d *= 2;
                this.f852k = false;
                this.f851j = i8 - 1;
                this.f849h = Arrays.copyOf(this.f849h, this.f845d);
                this.f847f = Arrays.copyOf(this.f847f, this.f845d);
                this.f848g = Arrays.copyOf(this.f848g, this.f845d);
            }
            this.f847f[i8] = iVar.f1111c;
            this.f849h[i8] = f;
            if (i5 != -1) {
                int[] iArr8 = this.f848g;
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                this.f848g[i8] = this.f850i;
                this.f850i = i8;
            }
            iVar.f1119k++;
            iVar.mo1312a(this.f843b);
            this.f842a++;
            if (!this.f852k) {
                this.f851j++;
            }
            int i11 = this.f851j;
            int[] iArr9 = this.f847f;
            if (i11 >= iArr9.length) {
                this.f852k = true;
                this.f851j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: a */
    public final float mo1091a(C0358i iVar, boolean z) {
        if (this.f846e == iVar) {
            this.f846e = null;
        }
        int i = this.f850i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f842a) {
            if (this.f847f[i] == iVar.f1111c) {
                if (i == this.f850i) {
                    this.f850i = this.f848g[i];
                } else {
                    int[] iArr = this.f848g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo1315b(this.f843b);
                }
                iVar.f1119k--;
                this.f842a--;
                this.f847f[i] = -1;
                if (this.f852k) {
                    this.f851j = i;
                }
                return this.f849h[i];
            }
            i2++;
            i3 = i;
            i = this.f848g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void mo1095a() {
        int i = this.f850i;
        int i2 = 0;
        while (i != -1 && i2 < this.f842a) {
            C0358i iVar = this.f844c.f1061c[this.f847f[i]];
            if (iVar != null) {
                iVar.mo1315b(this.f843b);
            }
            i = this.f848g[i];
            i2++;
        }
        this.f850i = -1;
        this.f851j = -1;
        this.f852k = false;
        this.f842a = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1101a(C0358i iVar) {
        int i = this.f850i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f842a) {
            if (this.f847f[i] == iVar.f1111c) {
                return true;
            }
            i = this.f848g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1096a(float f) {
        int i = this.f850i;
        int i2 = 0;
        while (i != -1 && i2 < this.f842a) {
            float[] fArr = this.f849h;
            fArr[i] = fArr[i] / f;
            i = this.f848g[i];
            i2++;
        }
    }

    /* renamed from: a */
    private boolean m1031a(C0358i iVar, C0353e eVar) {
        return iVar.f1119k <= 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.constraint.p042a.C0358i mo1093a(android.support.constraint.p042a.C0353e r15) {
        /*
            r14 = this;
            int r0 = r14.f850i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000a:
            r9 = -1
            if (r0 == r9) goto L_0x0097
            int r9 = r14.f842a
            if (r2 >= r9) goto L_0x0097
            float[] r9 = r14.f849h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            android.support.constraint.a.c r12 = r14.f844c
            android.support.constraint.a.i[] r12 = r12.f1061c
            int[] r13 = r14.f847f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0035
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0041
            r9[r0] = r3
            android.support.constraint.a.b r9 = r14.f843b
            r12.mo1315b(r9)
            goto L_0x0040
        L_0x0035:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0041
            r9[r0] = r3
            android.support.constraint.a.b r9 = r14.f843b
            r12.mo1315b(r9)
        L_0x0040:
            r10 = 0
        L_0x0041:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x008f
            android.support.constraint.a.i$a r11 = r12.f1116h
            android.support.constraint.a.i$a r13 = android.support.constraint.p042a.C0358i.C0359a.UNRESTRICTED
            if (r11 != r13) goto L_0x006b
            if (r4 != 0) goto L_0x0056
            boolean r4 = r14.m1031a(r12, r15)
        L_0x0052:
            r6 = r4
            r5 = r10
            r4 = r12
            goto L_0x008f
        L_0x0056:
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x005f
            boolean r4 = r14.m1031a(r12, r15)
            goto L_0x0052
        L_0x005f:
            if (r6 != 0) goto L_0x008f
            boolean r11 = r14.m1031a(r12, r15)
            if (r11 == 0) goto L_0x008f
            r5 = r10
            r4 = r12
            r6 = 1
            goto L_0x008f
        L_0x006b:
            if (r4 != 0) goto L_0x008f
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x008f
            if (r1 != 0) goto L_0x007b
            boolean r1 = r14.m1031a(r12, r15)
        L_0x0077:
            r8 = r1
            r7 = r10
            r1 = r12
            goto L_0x008f
        L_0x007b:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0084
            boolean r1 = r14.m1031a(r12, r15)
            goto L_0x0077
        L_0x0084:
            if (r8 != 0) goto L_0x008f
            boolean r11 = r14.m1031a(r12, r15)
            if (r11 == 0) goto L_0x008f
            r7 = r10
            r1 = r12
            r8 = 1
        L_0x008f:
            int[] r9 = r14.f848g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0097:
            if (r4 == 0) goto L_0x009a
            return r4
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.C0324a.mo1093a(android.support.constraint.a.e):android.support.constraint.a.i");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1097a(C0350b bVar, C0350b bVar2, boolean z) {
        int i = this.f850i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f842a) {
                int i3 = this.f847f[i];
                C0358i iVar = bVar2.f1054a;
                if (i3 == iVar.f1111c) {
                    float f = this.f849h[i];
                    mo1091a(iVar, z);
                    C0324a aVar = bVar2.f1057d;
                    int i4 = aVar.f850i;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f842a) {
                        mo1100a(this.f844c.f1061c[aVar.f847f[i4]], aVar.f849h[i4] * f, z);
                        i4 = aVar.f848g[i4];
                        i5++;
                    }
                    bVar.f1055b += bVar2.f1055b * f;
                    if (z) {
                        bVar2.f1054a.mo1315b(bVar);
                    }
                    i = this.f850i;
                } else {
                    i = this.f848g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1098a(C0350b bVar, C0350b[] bVarArr) {
        int i = this.f850i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f842a) {
                C0358i iVar = this.f844c.f1061c[this.f847f[i]];
                if (iVar.f1112d != -1) {
                    float f = this.f849h[i];
                    mo1091a(iVar, true);
                    C0350b bVar2 = bVarArr[iVar.f1112d];
                    if (!bVar2.f1058e) {
                        C0324a aVar = bVar2.f1057d;
                        int i3 = aVar.f850i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f842a) {
                            mo1100a(this.f844c.f1061c[aVar.f847f[i3]], aVar.f849h[i3] * f, true);
                            i3 = aVar.f848g[i3];
                            i4++;
                        }
                    }
                    bVar.f1055b += bVar2.f1055b * f;
                    bVar2.f1054a.mo1315b(bVar);
                    i = this.f850i;
                } else {
                    i = this.f848g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0358i mo1094a(boolean[] zArr, C0358i iVar) {
        int i = this.f850i;
        int i2 = 0;
        C0358i iVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f842a) {
            if (this.f849h[i] < 0.0f) {
                C0358i iVar3 = this.f844c.f1061c[this.f847f[i]];
                if ((zArr == null || !zArr[iVar3.f1111c]) && iVar3 != iVar) {
                    C0359a aVar = iVar3.f1116h;
                    if (aVar == C0359a.SLACK || aVar == C0359a.ERROR) {
                        float f2 = this.f849h[i];
                        if (f2 < f) {
                            iVar2 = iVar3;
                            f = f2;
                        }
                    }
                }
            }
            i = this.f848g[i];
            i2++;
        }
        return iVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0358i mo1092a(int i) {
        int i2 = this.f850i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f842a) {
            if (i3 == i) {
                return this.f844c.f1061c[this.f847f[i2]];
            }
            i2 = this.f848g[i2];
            i3++;
        }
        return null;
    }
}
