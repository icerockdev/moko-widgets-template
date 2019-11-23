/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package org.example.mpp

import dev.icerock.moko.widgets.core.WidgetScope
import dev.icerock.moko.widgets.screen.Args
import dev.icerock.moko.widgets.screen.BaseApplication
import dev.icerock.moko.widgets.screen.Screen
import kotlin.reflect.KClass

class App : BaseApplication() {
    override fun setup() {
        val rootWidgetScope = WidgetScope()

        registerScreenFactory(MainScreen::class) { MainScreen(rootWidgetScope) }
    }

    override fun getRootScreen(): KClass<out Screen<Args.Empty>> {
        return MainScreen::class
    }
}
