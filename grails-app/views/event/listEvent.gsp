<h2>Evenement à venir</h2>
<ul style="font-size: 100%">
	<g:each var="event" in="${events}">
	<li><a href="/event/voteEvent?eventId=${event.id}">${event.name}</a>, proposé par ${event.owner.name} (le <g:dateFormat format='dd-MM-yyyy' date="${event.eventDate}"/> à <g:dateFormat format="hh:mm" date="${event.eventDate}"/>)</li>
	</g:each>
</ul>