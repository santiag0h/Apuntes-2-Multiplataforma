from odoo import fields, models

class Coleccion(models.Model):
    _name="pokestore.collection"
    _description="Colección de figuras"
    _order="name"
    name = fields.Char(string="Nombre", required=True)
    generacion = fields.Integer(string="Generacion", required=True)
    fecha_de_lanzamiento= fields.Date(string="Fecha de lanzamiento", required=True)
    active=fields.Boolean(default=True)
    figure_ids = fields.One2many("pokestore.figure","collection_id", string="Figuras")