package android.support.constraint.p042a.p043a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.a.m */
/* compiled from: Helper */
public class C0341m extends C0335h {

    /* renamed from: va */
    protected C0335h[] f1024va = new C0335h[4];

    /* renamed from: wa */
    protected int f1025wa = 0;

    /* renamed from: J */
    public void mo1229J() {
        this.f1025wa = 0;
    }

    /* renamed from: b */
    public void mo1233b(C0335h hVar) {
        int i = this.f1025wa + 1;
        C0335h[] hVarArr = this.f1024va;
        if (i > hVarArr.length) {
            this.f1024va = (C0335h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
        }
        C0335h[] hVarArr2 = this.f1024va;
        int i2 = this.f1025wa;
        hVarArr2[i2] = hVar;
        this.f1025wa = i2 + 1;
    }
}
