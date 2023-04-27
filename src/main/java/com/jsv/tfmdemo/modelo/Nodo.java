package com.jsv.tfmdemo.modelo;

import java.awt.Color;
import java.util.Map.Entry;
import java.util.Set;

import org.gephi.graph.api.Column;
import org.gephi.graph.api.ColumnIterable;
import org.gephi.graph.api.Element;
import org.gephi.graph.api.GraphView;
import org.gephi.graph.api.Interval;
import org.gephi.graph.api.NodeProperties;
import org.gephi.graph.api.Table;
import org.gephi.graph.api.TextProperties;
import org.gephi.graph.spi.LayoutData;

public class Nodo implements Element, NodeProperties{
	
	private Integer id;
	
	private String usuario;
	
	private String apellidos;
	
	public Nodo(Integer id, String usuario, String apellidos) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.apellidos = apellidos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Nodo [id=" + id + ", usuario=" + usuario + ", apellidos=" + apellidos + "]";
	}

	@Override
	public float r() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float g() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float b() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRGBA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float alpha() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TextProperties getTextProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setR(float r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setG(float g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setB(float b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAlpha(float a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float x() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float y() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float z() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFixed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T extends LayoutData> T getLayoutData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setX(float x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(float y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setZ(float z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSize(float size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition(float x, float y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition(float x, float y, float z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFixed(boolean fixed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLayoutData(LayoutData layoutData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(Column column) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String key, double timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(Column column, double timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String key, Interval interval) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(Column column, Interval interval) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(String key, GraphView view) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getAttribute(Column column, GraphView view) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Entry> getAttributes(Column column) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getAttributeKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ColumnIterable getAttributeColumns() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStoreId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object removeAttribute(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(Column column) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(String key, double timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(Column column, double timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(String key, Interval interval) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(Column column, Interval interval) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLabel(String label) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(Column column, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(String key, Object value, double timestamp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(Column column, Object value, double timestamp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(String key, Object value, Interval interval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAttribute(Column column, Object value, Interval interval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addTimestamp(double timestamp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeTimestamp(double timestamp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTimestamp(double timestamp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double[] getTimestamps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addInterval(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeInterval(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasInterval(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Interval[] getIntervals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interval getTimeBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearAttributes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Table getTable() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
