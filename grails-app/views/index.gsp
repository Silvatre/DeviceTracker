<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>
		<style type="text/css" media="screen">
			#status {
				background-color: #eee;
				border: .2em solid #fff;
				margin: 2em 2em 1em;
				padding: 1em;
				width: 12em;
				float: left;
				-moz-box-shadow: 0px 0px 1.25em #ccc;
				-webkit-box-shadow: 0px 0px 1.25em #ccc;
				box-shadow: 0px 0px 1.25em #ccc;
				-moz-border-radius: 0.6em;
				-webkit-border-radius: 0.6em;
				border-radius: 0.6em;
			}

			.ie6 #status {
				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
			}

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

			#status li {
				line-height: 1.3;
			}

			#status h1 {
				text-transform: uppercase;
				font-size: 1.1em;
				margin: 0 0 0.3em;
			}

			#page-body {
				margin: 2em 1em 1.25em 18em;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}

			@media screen and (max-width: 480px) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
		</style>
	</head>
	<body>
		<div id="status" role="complementary">
			<h1>Treść zadania</h1>
			<p>Zadanie polegało na stworzeniu aplikacji we frameworku Grails, zawierające 
			dwie sensowne klasy domenowe. Ponadto można było do projektu dodać 
			zewnętrzny framework/bibliotekę.</p>
			
			<h1>Realizacja zadania</h1>
			<p>Stworzony został projekt o nazwie DeviceTracker. Zawiera on dwie klasy domenowe - Device (urządzenie) oraz Location (lokalizacja). 
			Idea projektu polega na zapisywaniu lokalizacji danego urządzenia (tracking), którą można później wizualizować w czasie np. na Google Maps.
			Do projektu został dodany framework Bootstrap z darmowym szablonem.</p>
			
			<h1>Napotkane problemy</h1>
			<p>W obecnej wersji frameworku Grails (2.4) występuje dość krytyczny błąd generowania NullPointerException przy odświeżaniu wygenerowanych stron CRUD [<a href="https://jira.grails.org/browse/GRAILS-11430">link</a>]</p>
			
			<h1>Wnioski</h1>
			<p>Dostosowywanie do własnych potrzeb widoków wygenerowanych dla klas domenowych należy przeprowadzać dopiero po ich ostatecznej wersji - ponowna generacja usunie naniesione zmiany. Innym rozwiązaniem jest edycja szablonów wykorzystywanych do generowania widoków.</p>
		</div>
	</body>
</html>
