Android ToDoDO
=================
Это начало еще одной программы записи фактов (идеи, планы, действия, события, деньги).

Пишу ее для Android на Kotlin c ПОЛНЫМ применением рекомендуемой архитектуры и почти ВСЕМИ технологиями Jetpack, а именно:

Основные технологии Jetpack я здесь реализовал, и они работают в тестовом режиме.

<li>
  
Что бы запустить приложение выполните следующие шаги:
-----------------------------------------------------

•	Запустить Android Studio 4.1.2 stable 

•	File>New>Project from Version Control…

•	Вставить в URL: https://github.com/Dzendo/ToDo_Sky 

•	Clone

•	Ждем пока соберется

•	* Build>Clean Project; Build> Rebuild Project, 

•	В окне Build нет ошибок, есть только одно предупреждение 
“ API 'BaseVariant.getApplicationIdTextResource' is obsolete…”

•	Play на Android API 26-30

•	Откроется стартовый экран ToDoD=0

•	Три точки в тор баре > Добавить пачку
сгенерирует в db SQL Room на телефоне 800 записей-фактов с датами 2000-2040 года

•	Свайпнуть снизу вверх – снизу появится bottom меню

•	Переключаемся между «домиками»
отбирает факты (Идея, План, Действия, События, Деньги) только 2021 года
переключение мгновенное хотя ничего в памяти нет, только правильные ключи и фильтры SQLite

•	* Левая шторка (бургер) > todo таблица или повторное нажатие на «домик»
– дает полную таблицу (для отладки)

•	Изменить ориентацию экрана туда обратно 
Вместо карточек дает текстовую таблицу и обратно

•	Кликнуть на карточку факта -
открывает карточку факта без дизайна

•	Три точки в карточке > Добавить/Изменить/Удалить одну запись

•	Для изврата: Три точки > Размер пачки > 800 тыс. > Три точки> Добавить пачку
придется подождать – добавления записей db  - генерация 1млн записей операция не быстрая – 3 мин

•	На базе почти 1млн записей переключаемся между «домиками» отбирает факты 
(Идея, План, Действия, События, Деньги) 2021 года сортированные по дате
Первый выбор несколько секунд, а за тем мгновенно (в памяти ничего не храню) 

•	* Можно еще добавить по 800 тыс. несколько раз – до 7-10 млн записей, 
я генерировал 14 млн (по 8 млн– около часа)  - то же будет сортировать первый раз 3 мин, потом 10 сек.

</li>

<li>
  
Технологии:
-----------  

Архитектура рекомендованная с ViewModel и Repository

База данных хранится в Room и достается Paging 3

Применена навигация и Hilt

XML – two-way Data Binding с Lifecycle и LifeData;

Recycler View через Paging 3 пользуется урезанным классом для ускорения

Все операции ввода вывода запускаются из Coroutines.
</li>
Пока я достиг потолка быстродействия вывода таблицы по фильтру с сортировкой.

Проблема, которую пока не могу решить:

Paging 3 никаким известным мне образом не отменяет устаревший запрос, чтобы начать выполнять новый: он заканчивает старый запрос, а потом только начинает новый – бьюсь над этим (нужен Senior).

Комментарии внутри текста излишне подробные - специально для супруги (QA ISTQB), 
так что комментарии для разъяснения с нуля, не обращайте внимания.


License
-------

Copyright 2018 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.

