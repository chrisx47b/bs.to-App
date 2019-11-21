package android.support.design.internal;

import android.content.Context;
import android.support.p047v7.view.menu.C0810l;
import android.support.p047v7.view.menu.C0829w;
import android.support.p047v7.widget.LinearLayoutManager;
import android.support.p047v7.widget.RecyclerView;
import android.util.AttributeSet;

public class NavigationMenuView extends RecyclerView implements C0829w {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo1413a(C0810l lVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
