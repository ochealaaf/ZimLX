/*
 *     Copyright (C) 2019 Lawnchair Team.
 *
 *     This file is part of Lawnchair Launcher.
 *
 *     Lawnchair Launcher is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Lawnchair Launcher is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Lawnchair Launcher.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.zimmob.zimlx.globalsearch.providers.web

import android.content.Context
import com.android.launcher3.R
import org.zimmob.zimlx.locale

class YandexWebSearchProvider(context: Context) : WebSearchProvider(context) {
    override val searchUrl = "https://yandex.com/search/?text=%s"
    override val suggestionsUrl = "https://suggest.yandex.com/suggest-ff.cgi?part=%s&uil=${context.locale.language}"
    override val name = context.getString(R.string.web_search_yandex)

    override fun getIcon() = context.getDrawable(R.drawable.ic_yandex)!!
}