/*
 * SPDX-FileCopyrightText: 2023 Linnea Gräf <nea@nea.moe>
 * SPDX-FileCopyrightText: 2024 Linnea Gräf <nea@nea.moe>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package moe.nea.firmament.util.item

import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.LoreComponent
import net.minecraft.item.ItemStack
import net.minecraft.text.Text

var ItemStack.loreAccordingToNbt
    get() = get(DataComponentTypes.LORE)?.lines ?: listOf()
    set(value) {
        set(DataComponentTypes.LORE, LoreComponent(value))
    }

var ItemStack.displayNameAccordingToNbt: Text
    get() = get(DataComponentTypes.CUSTOM_NAME) ?: get(DataComponentTypes.ITEM_NAME) ?: item.name
    set(value) {
        set(DataComponentTypes.CUSTOM_NAME, value)
    }

fun ItemStack.setCustomName(text: Text) {
    set(DataComponentTypes.CUSTOM_NAME, text)
}
