﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Desguace_Net.DarUnidadTipo;
using System.Text.RegularExpressions;
using Desguace_Net;

namespace Desguace_Net
{
    public partial class Hacer_Oferta : Form
    {
        int IdDes = 0;
        int IdRe = 0;
       private  Request request = new Request();

        public Hacer_Oferta(Request req,int idDes)
        {
            InitializeComponent();
            IdDes = idDes;
            IdRe = req.Code;
            request = req;


        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void Hacer_Oferta_Load(object sender, EventArgs e)
        {
            DarUnidadesClient c =new DarUnidadesClient();
            dynamic json = Newtonsoft.Json.JsonConvert.DeserializeObject<List<String>>(c.DarTodasUnidades());
            
            Concepto.Text = "Tipo: " + request.Type;
            LTam.Text = "Tamaño:" + ((request.Size != null && request.Size != 0.0) ? request.Size.ToString() +c.DarUnidadId(request.SizeUnit) : "");
        }

        private void EnviarOferta_Click(object sender, EventArgs e)
        {
            ErrorCantidad.Visible = false;
            ErrorPrecio.Visible = false;
           
          
            bool correcto = true;

          
            if (!checkNumber(Cant_Text.Text))
            {
                ErrorCantidad.Visible = true;
                ErrorCantidad.Text = "No es un número";
                correcto = false;
            }
           


            if (!checkNumber(Precio_Text.Text) || Precio_Text.Text == "" || Precio_Text.Text == null)
            {
                ErrorPrecio.Visible = true;
                ErrorPrecio.Text = "Error no es un número o no puedo estar vacío";
                correcto = false;
            }

            if (correcto)
            {
                String oferta = Pieza_Text.Text + "," + ((request.Size != null) ? request.Size.ToString() : "") + "," + request.SizeUnit + "," + ColorText.Text + "," + Cant_Text.Text + "," + Precio_Text.Text + "," + IdDes + "," + IdRe;
                Services.TopicPublisher p = new Services.TopicPublisher("OfferDelivery", "tcp://stv:61616");
                p.SendMessage(oferta);
                if (MessageBox.Show("Oferta Enviada", "", MessageBoxButtons.OK,
      MessageBoxIcon.Information) == DialogResult.OK)
                {
                    Close();
                }
            }

        }
        private bool checkNumber(string number)
        {
            if(number !=null && number!="")
                return Regex.IsMatch(number, @"^[0-9]+([.,][0-9]+)?$");
            
            return true;
        }

    }
}
