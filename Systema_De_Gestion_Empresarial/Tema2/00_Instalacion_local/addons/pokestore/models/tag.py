from odoo import fields, models
class PokeStoreTag(models.Model):
    _name = "pokestore.tag"
    _description = "etiquetas de la pokestore"
    _order = "name"
    name = fields.Char(string="Nombre", required=True)