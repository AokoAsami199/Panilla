package com.ruinscraft.panilla.craftbukkit.v1_18_R1.nbt;

import com.ruinscraft.panilla.api.nbt.INbtTagCompound;
import com.ruinscraft.panilla.api.nbt.INbtTagList;
import net.minecraft.nbt.NBTTagList;

public class NbtTagList implements INbtTagList {

    private final NBTTagList handle;

    public NbtTagList(NBTTagList handle) {
        this.handle = handle;
    }

    @Override
    public INbtTagCompound getCompound(int index) {
        return new NbtTagCompound(handle.a(index));
    }

    @Override
    public String getString(int index) {
        return handle.j(index);
    }

    @Override
    public int size() {
        return handle.size();
    }

}
