/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.scheduler;

import org.spongepowered.api.Sponge;

import java.util.function.Supplier;

public final class TaskPriorities {

    //sortfields:ON
    public static final Supplier<TaskPriority> EXTREMELY_HIGH = Sponge.getRegistry().getCatalogRegistry().provideSupplier(TaskPriority.class, "EXTREMELY_HIGH");
    public static final Supplier<TaskPriority> VERY_HIGH = Sponge.getRegistry().getCatalogRegistry().provideSupplier(TaskPriority.class, "VERY_HIGH");
    public static final Supplier<TaskPriority> HIGH = Sponge.getRegistry().getCatalogRegistry().provideSupplier(TaskPriority.class, "HIGH");
    public static final Supplier<TaskPriority> NORMAL = Sponge.getRegistry().getCatalogRegistry().provideSupplier(TaskPriority.class, "NORMAL");
    public static final Supplier<TaskPriority> LOW = Sponge.getRegistry().getCatalogRegistry().provideSupplier(TaskPriority.class, "LOW");
    public static final Supplier<TaskPriority> VERY_LOW = Sponge.getRegistry().getCatalogRegistry().provideSupplier(TaskPriority.class, "VERY_LOW");
    public static final Supplier<TaskPriority> EXTREMELY_LOW = Sponge.getRegistry().getCatalogRegistry().provideSupplier(TaskPriority.class, "EXTREMELY_LOW");
    //sortfields:OFF

    private TaskPriorities() {
    }

}
