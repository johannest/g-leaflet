package org.peimari.gleaflet.client;

import org.peimari.gleaflet.client.Control.Attribution;
import org.peimari.gleaflet.client.Control.Control;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class Map extends JavaScriptObject {
	
	protected Map() {}
	
	/**
	 * Initializes Leaflet map overlay (L.Map) around given element.
	 *  
	 * @param e
	 * @param options 
	 * @return
	 */
	public static native Map create(Element e, MapOptions options) 
	/*-{
		return new $wnd.L.Map(e,options);
	}-*/;

	public native final int getZoom() 
	/*-{
		return this.getZoom();
	}-*/;

	public native final void setView(LatLng center, Integer zoom) 
	/*-{
		this.setView(center,zoom,null);
	}-*/;

	public native final LatLngBounds getBounds() 
	/*-{
		return this.getBounds();
	}-*/;

	public native final void fitBounds(LatLngBounds b) 
	/*-{
		this.fitBounds(b);
	}-*/;

	public native final Attribution getAttributionControl() 
	/*-{
		return this.attributionControl;
	}-*/;

	public native final void invalidateSize() 
	/*-{
		this.invalidateSize();
	}-*/;

	public native final void addLayer(ILayer layer) 
	/*-{
		this.addLayer(layer);
	}-*/;

	public native final void removeLayer(ILayer layer) 
	/*-{
		this.removeLayer(layer);
	}-*/;

	public native final void addClickListener(ClickListener listener) 
	/*-{
		this.on("click", function(e) {
				$entry(listener.@org.peimari.gleaflet.client.ClickListener::onClick(Lorg/peimari/gleaflet/client/MouseEvent;)(e));
		});
	}-*/;

	public native final void addControl(Control control) 
	/*-{
		this.addControl(control);
	}-*/;

	public native final void addMoveEndListener(MoveEndListener listener) 
	/*-{
		this.on("moveend", function(e) {
				$entry(listener.@org.peimari.gleaflet.client.MoveEndListener::onMoveEnd(Lorg/peimari/gleaflet/client/Event;)(e));
		});
	}-*/;

}