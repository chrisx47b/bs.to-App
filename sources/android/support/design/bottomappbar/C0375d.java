package android.support.design.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* renamed from: android.support.design.bottomappbar.d */
/* compiled from: BottomAppBar */
class C0375d implements ClassLoaderCreator<C0371a> {
    C0375d() {
    }

    public C0371a[] newArray(int i) {
        return new C0371a[i];
    }

    public C0371a createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C0371a(parcel, classLoader);
    }

    public C0371a createFromParcel(Parcel parcel) {
        return new C0371a(parcel, null);
    }
}
