/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package org.example.mpp

import dev.icerock.moko.resources.desc.desc
import dev.icerock.moko.widgets.container
import dev.icerock.moko.widgets.core.Widget
import dev.icerock.moko.widgets.core.WidgetScope
import dev.icerock.moko.widgets.screen.Args
import dev.icerock.moko.widgets.screen.WidgetScreen
import dev.icerock.moko.widgets.style.view.Alignment
import dev.icerock.moko.widgets.text
import org.example.library.MR

class MainScreen(
    private val widgetScope: WidgetScope
) : WidgetScreen<Args.Empty>() {
    override fun createContentWidget(): Widget {
        return with(widgetScope) {
            container(
                children = mapOf(
                    text(
                        text = const(MR.strings.hello_world.desc())
                    ) to Alignment.CENTER
                )
            )
        }
    }
}
